package main.decorator.components;

import main.decorator.Pizza;
import main.decorator.PizzaMaker;

public class CheeseDecorator extends Decorator {

	public CheeseDecorator(int amount, PizzaMaker maker) {
		super(amount, maker);
	}

	public CheeseDecorator(PizzaMaker maker) {
		super(maker);
	}

	@Override
	protected void addComponent(Pizza pizza) {
		pizza.addComponent("cheese");
	}
}
