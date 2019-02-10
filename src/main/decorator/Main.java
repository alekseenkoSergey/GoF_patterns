package main.decorator;

import main.decorator.components.*;

public class Main {

	public static void main(String[] args) {
		PizzaMaker pizzaMaker;
		Pizza pizza;

		pizzaMaker = new BowDecorator(3, new MushroomsDecorator(2, new BaconDecorator(new PizzaMakerImpl())));
		pizza = pizzaMaker.makePizza();
		System.out.println(pizza);

		pizzaMaker = new CheeseDecorator(2, new PepperDecorator(new ChickenDecorator(new PizzaMakerImpl())));
		pizza = pizzaMaker.makePizza();
		System.out.println(pizza);

		pizzaMaker = new BowDecorator(new PepperDecorator(new MushroomsDecorator(4, new PizzaMakerImpl())));
		pizza = pizzaMaker.makePizza();
		System.out.println(pizza);
	}
}
