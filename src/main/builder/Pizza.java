package main.builder;

public class Pizza {

	private String dough;
	private String sauce;
	private String topping;

	private PizzaBuilder builder;

	public Pizza(PizzaBuilder builder) {
		this.builder = builder;
	}

	public void construct() {
		dough = builder.getDough();
		sauce = builder.getSauce();
		topping = builder.getTopping();
	}

	@Override
	public String toString() {
		return "Pizza{" +
				"dough='" + dough + '\'' +
				", sauce='" + sauce + '\'' +
				", topping='" + topping + '\'' +
				", builder=" + builder +
				'}';
	}
}
