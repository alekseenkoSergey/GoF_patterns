package main.decorator.components;

import main.decorator.Pizza;
import main.decorator.PizzaMaker;

public class MushroomsDecorator extends Decorator {

	public MushroomsDecorator(int amount, PizzaMaker maker) {
		super(amount, maker);
	}

	public MushroomsDecorator(PizzaMaker maker) {
		super(maker);
	}

	@Override
	protected void addComponent(Pizza pizza) {
		pizza.addComponent("mushrooms");
	}
}
