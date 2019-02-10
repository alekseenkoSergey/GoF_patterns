package main.decorator.components;

import main.decorator.Pizza;
import main.decorator.PizzaMaker;

public class BaconDecorator extends Decorator {

	public BaconDecorator(int amount, PizzaMaker maker) {
		super(amount, maker);
	}

	public BaconDecorator(PizzaMaker maker) {
		super(maker);
	}

	@Override
	protected void addComponent(Pizza pizza) {
		pizza.addComponent("bacon");
	}

}
