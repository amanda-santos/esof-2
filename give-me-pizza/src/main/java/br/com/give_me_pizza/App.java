package br.com.give_me_pizza;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int op = 0;

		Customer customer = new Customer();
		Pizza pizza = new Pizza();

		do {
			System.out.println("----------------------------------------");
			System.out.println("--------------GIVE ME PIZZA-------------");
			System.out.println("----------------------------------------");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Cadastrar pizza");
			System.out.println("3 - Exibir cliente");
			System.out.println("4 - Exibir pizza");
			System.out.println("5 - Sair");
			System.out.println("----------------------------------------");
			System.out.println("Digite a opção: ");
			op = keyboard.nextInt();
			keyboard.nextLine();

			switch (op) {
			case 1:
				System.out.println("Informe o primeiro nome: ");
				String firstName = keyboard.nextLine();
				customer.setFirstName(firstName);

				System.out.println("Informe o sobrenome: ");
				String surname = keyboard.nextLine();
				customer.setSurname(surname);

				System.out.println("Informe o número: ");
				int number = keyboard.nextInt();
				keyboard.nextLine();

				System.out.println("Informe a rua: ");
				String street = keyboard.nextLine();

				System.out.println("Informe a cidade: ");
				String city = keyboard.nextLine();

				customer.setAddress(new Address(number, street, city));
				break;

			case 2:
				System.out.println("Informe o sabor: ");
				String flavor = keyboard.nextLine();
				pizza.setFlavor(flavor);

				System.out.print("Informe o valor: R$ ");
				double price = keyboard.nextDouble();
				keyboard.nextLine();
				pizza.setPrice(price);

				System.out.println("Informe o tamanho: ");
				String size = keyboard.nextLine();
				pizza.setSize(size);
				break;

			case 3:
				System.out.println(customer.toString());
				break;
				
			case 4:
				System.out.println(pizza.toString());
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
		} while (op != 5);

		keyboard.close();
	}
}
