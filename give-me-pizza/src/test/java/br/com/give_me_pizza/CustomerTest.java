package br.com.give_me_pizza;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
	private static Customer customer;
	private static Address address;

	@BeforeAll
	public static void init() {
		customer = new Customer();
		customer.setCustomerID(1);
		customer.setFirstName("Amanda");
		customer.setSurname("Santos");

		address = new Address(123, "Silva", "Ouro Branco");
		customer.setAddress(address);
	}

	@Test
	void testCustomerID() {
		assertEquals(1, customer.getCustomerID());
	}

	@Test
	void testVerifyCustomerName() {
		assertAll("Validating Customer name", () -> assertEquals("Amanda", customer.getFirstName()),
				() -> assertEquals("Santos", customer.getSurname()));
	}

	@Test
	void testVerifyCustomerAddress() {
		assertSame(customer.getAddress(), address);
	}
	
	@Test
	void testCustomerToString() {
		assertEquals("Amanda Santos\n" + customer.getAddress().toString(), customer.toString());
	}
}
