package main.decorator.components;

import main.decorator.Pizza;
import main.decorator.PizzaMaker;

public class ChickenDecorator extends Decorator {

	public ChickenDecorator(int amount, PizzaMaker maker) {
		super(amount, maker);
	}

	public ChickenDecorator(PizzaMaker maker) {
		super(maker);
	}

	@Override
	protected void addComponent(Pizza pizza) {
		pizza.addComponent("chicken");
	}
}
