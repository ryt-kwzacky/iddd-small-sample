package com.createuser.unit.core.user

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

	@Test
	fun `handle - create UserAccount under the right conditions `() {
		val command = CreateUserAccountCommand.create()
		var todo = command.todo

		/**
		 * Before
		 */
		assertThat(todo).isEqualTo("TODO")

		/**
		 * Perform useCase
		 */
		// useCase.handle(command)
		todo = "todo"


		/**
		 * After
		 */
		assertThat(todo).isEqualTo("todo")


	}

}
