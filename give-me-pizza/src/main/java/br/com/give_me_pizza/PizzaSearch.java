package br.com.give_me_pizza;
import org.json.JSONObject;

public class PizzaSearch {
	private PizzaService pizzaService;
	
	public PizzaSearch(PizzaService service) {
		pizzaService = service;
	}
	
	public Pizza getPizza(String flavor) {
		String pizzaInfo = pizzaService.search(flavor);
		JSONObject pizzaJson = new JSONObject(pizzaInfo);
		double pizzaPrice = (double)pizzaJson.get("price");
		
		return new Pizza(flavor, pizzaPrice);
	}
}
