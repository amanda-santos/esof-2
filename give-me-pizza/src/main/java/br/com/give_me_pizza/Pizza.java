package br.com.give_me_pizza;

public class Pizza {
	private String flavor;
	private String size;
	private double price;

	public Pizza(String flavor, double price) {
		super();
		this.flavor = flavor;
		this.price = price;
	}

	public Pizza() {
		super();
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return ("Pizza " + this.getFlavor() + " tamanho " + this.getSize() + " por R$ " + this.getPrice());
	}
}
