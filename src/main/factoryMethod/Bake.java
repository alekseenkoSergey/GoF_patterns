package main.factoryMethod;

import main.factoryMethod.dishes.Cake;
import main.factoryMethod.dishes.Dish;
import main.factoryMethod.dishes.Pie;

public class Bake {

	// Вариант 1
	public Dish makeDish(String dishName) {
		if ("cake".equals(dishName)) {
			return new Cake();
		} else if ("pie".equals(dishName)) {
			return new Pie();
		} else {
			throw new IllegalArgumentException("Unknown dish " + dishName);
		}
	}

}
