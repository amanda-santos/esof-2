package br.com.give_me_pizza;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {
	private static Pizza pizza;

	@BeforeAll
	public static void init() {
		pizza = new Pizza();
		pizza.setFlavor("Marguerita");
		pizza.setPrice(24.99);
		pizza.setSize("Grande");
	}

	@Test
	void testVerifyPizza() {
		assertAll("Validating pizza", () -> assertEquals("Marguerita", pizza.getFlavor()),
				() -> assertEquals(24.99, pizza.getPrice()), () -> assertEquals("Grande", pizza.getSize()));
	}
	
	@Test
	void testPizzaToString() {
		assertEquals("Pizza Marguerita tamanho Grande por R$ 24.99", pizza.toString());
	}
}
