package main.decorator;

public class PizzaMakerImpl implements PizzaMaker {

	@Override
	public Pizza makePizza() {
		return new Pizza();
	}
}
