package main.factoryMethod.dishes;

public abstract class Dish {

	// Вариант 2
	public static Dish getInstance(String dishName) {
		if ("cake".equals(dishName)) {
			return new Cake();
		} else if ("pie".equals(dishName)) {
			return new Pie();
		} else {
			throw new IllegalArgumentException("Unknown dish " + dishName);
		}
	}

	public abstract String taste();

}
