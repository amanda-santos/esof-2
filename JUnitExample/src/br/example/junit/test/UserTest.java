package br.example.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.example.junit.User;

class UserTest {

	private static User user;

	@BeforeAll
	public static void init() {
		user = new User();
		user.setFirstName("Amanda");
		user.setSurname("Santos");
		user.setUserID(1);
	}

	@Test
	void testUserName() {
		assertEquals("Amanda", user.getFirstName());
	}

	@Test
	void testUserSurname() {
		assertEquals("Santos", user.getSurname());
	}

	@Test
	void testUserID() {
		assertEquals(1, user.getUserID());
	}

	@Test
	void testCompareTwoObjects() {
		User userTemp = user;
		assertSame(user, userTemp);
	}

	@Test
	void testVerifyUserName() {
		assertAll("Validating user name", () -> assertEquals("Amanda", user.getFirstName()),
				() -> assertEquals("Santos", user.getSurname()));
	}

}
