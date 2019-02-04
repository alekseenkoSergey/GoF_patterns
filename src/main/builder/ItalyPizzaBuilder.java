package main.builder;

public class ItalyPizzaBuilder implements PizzaBuilder {
	@Override
	public String getDough() {
		return "italian dough";
	}

	@Override
	public String getSauce() {
		return "italy sauce";
	}

	@Override
	public String getTopping() {
		return "italy topping";
	}
}
