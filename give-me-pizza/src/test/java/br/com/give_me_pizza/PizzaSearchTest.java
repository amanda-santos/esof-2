package br.com.give_me_pizza;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/* Using the annotation Mock and InjectMocks, ExtendWith */

@ExtendWith(MockitoExtension.class)
public class PizzaSearchTest {
	
	@Mock
	private PizzaService pizzaServiceTest;
	@InjectMocks
	private PizzaSearch pizza;
	
	@Test
	public void testNullPizzaFlavor() {
		Mockito.when(pizzaServiceTest.search(Mockito.anyString())).thenReturn(PizzaCONST.NULL);
		double price = pizza.getPizza("").getPrice();
		assertEquals(0.00, price);
	}
	
	@Test
	public void testMargueritaPizzaFlavor() {
		Mockito.when(pizzaServiceTest.search("MARGUERITA")).thenReturn(PizzaCONST.MARGUERITA);
		double price = pizza.getPizza("MARGUERITA").getPrice();
		assertEquals(24.90, price);
	}
}
