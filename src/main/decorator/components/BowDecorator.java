package main.decorator.components;

import main.decorator.Pizza;
import main.decorator.PizzaMaker;

public class BowDecorator extends Decorator {

	public BowDecorator(int amount, PizzaMaker maker) {
		super(amount, maker);
	}

	public BowDecorator(PizzaMaker maker) {
		super(maker);
	}

	@Override
	protected void addComponent(Pizza pizza) {
		pizza.addComponent("bow");
	}
}
