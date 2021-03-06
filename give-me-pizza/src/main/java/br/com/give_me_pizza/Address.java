package br.com.give_me_pizza;

public class Address {
	private int number;
	private String street;
	private String city;

	public Address() {
		super();
	}

	public Address(int number, String street, String city) {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return ("Rua " + this.getStreet() + ", " + this.getNumber() + " - " + this.getCity());
	}
}
