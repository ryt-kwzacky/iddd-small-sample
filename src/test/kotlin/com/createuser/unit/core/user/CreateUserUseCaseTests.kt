package com.createuser.unit.core.user

import com.createuser.core.domain.userAccount.*
import com.createuser.core.port.userAccount.db.InMemoryUserAccountRepository
import com.createuser.core.useCase.userAccount.CreateUserAccountUseCase
import com.createuser.core.useCase.userAccount.command.CreateUserAccountCommand
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class CreateUserUseCaseTests {
	private val userAccountRepository = InMemoryUserAccountRepository()

	private val useCase = CreateUserAccountUseCase(
			userAccountRepository = userAccountRepository
	)

	@Before
	fun setUp() {
		userAccountRepository.reset()
	}

	val defaultId = UserId("test-id")
	val defaultName = UserName("test-name")
	val defaultSex = UserSexType.MAN
	val defaultAge = UserAge(20)
	val defaultSelfIntroduction = SelfIntroduction("test-self-introduction")

	@Test
	fun `handle - create UserAccount under the right conditions`() {
		val command = CreateUserAccountCommand.create(
				id = defaultId.value,
				name = defaultName.value,
				sex = defaultSex,
				age = defaultAge.value,
				selfIntroduction = defaultSelfIntroduction.value
		)

		/**
		 * Before
		 */
		assertThat(userAccountRepository.findById(defaultId).exists()).isFalse()
		assertThat(userAccountRepository.count()).isEqualTo(0)

		/**
		 * Perform useCase
		 */
		useCase.handle(command)

		/**
		 * After
		 */
		assertThat(userAccountRepository.findById(defaultId).exists()).isTrue()
		assertThat(userAccountRepository.count()).isEqualTo(1)

	}

	@Test
	fun `handle - raise exception when same id is registering`() {
		val defaultName = UserName("test-name2")
		val defaultSex = UserSexType.WOMAN
		val defaultAge = UserAge(25)

		val command = CreateUserAccountCommand.create(
				id = defaultId.value,
				name = defaultName.value,
				sex = defaultSex,
				age = defaultAge.value,
				selfIntroduction = defaultSelfIntroduction.value
		)

		useCase.handle(command)

		/**
		 * Before
		 */
		assertThat(userAccountRepository.findById(defaultId).exists()).isTrue()
		assertThat(userAccountRepository.count()).isEqualTo(1)

		/**
		 * Perform useCase
		 */
		useCase.handle(command)

		/**
		 * After
		 */
		assertThat(userAccountRepository.findById(defaultId).exists()).isTrue()
		assertThat(userAccountRepository.count()).isEqualTo(1)

	}

}
