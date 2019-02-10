package main.decorator.components;

import main.decorator.Pizza;
import main.decorator.PizzaMaker;

public abstract class Decorator implements PizzaMaker {

	private PizzaMaker maker;
	private int amount;

	public Decorator(int amount, PizzaMaker maker) {
		this.maker = maker;
		this.amount = amount;
	}

	public Decorator(PizzaMaker maker) {
		this(1, maker);
	}


	@Override
	public Pizza makePizza() {
		Pizza pizza = maker.makePizza();
		for (int i = 0; i < amount; i++) {
			addComponent(pizza);
		}
		return pizza;
	}

	protected abstract void addComponent(Pizza pizza);
}
