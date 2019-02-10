package main.decorator.components;

import main.decorator.Pizza;
import main.decorator.PizzaMaker;

public class PepperDecorator extends Decorator {

	public PepperDecorator(int amount, PizzaMaker maker) {
		super(amount, maker);
	}

	public PepperDecorator(PizzaMaker maker) {
		super(maker);
	}

	@Override
	protected void addComponent(Pizza pizza) {
		pizza.addComponent("pepper");
	}
}
