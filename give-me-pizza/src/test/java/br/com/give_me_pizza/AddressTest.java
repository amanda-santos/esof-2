package br.com.give_me_pizza;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {
	private static Address address;

	@BeforeAll
	public static void init() {
		address = new Address();
		address.setNumber(120);
		address.setStreet("Rosas");
		address.setCity("Belo Horizonte");
	}

	@Test
	void testVerifyAddress() {
		assertAll("Validating address", () -> assertEquals(120, address.getNumber()),
				() -> assertEquals("Rosas", address.getStreet()),
				() -> assertEquals("Belo Horizonte", address.getCity()));
	}
	
	@Test
	void testAddressToString() {
		assertEquals("Rua Rosas, 120 - Belo Horizonte", address.toString());
	}
}
