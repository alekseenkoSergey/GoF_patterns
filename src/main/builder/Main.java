package main.builder;

public class Main {

	public static void main(String[] args) {
		Pizza pizza = new Pizza(new ItalyPizzaBuilder());
		pizza.construct();
		System.out.println(pizza);
	}
}
