package main.factoryMethod;

import main.factoryMethod.dishes.Dish;

public class Main {

	public static void main(String[] args) {
		Bake bake = new Bake();
		Dish dish;

		// Вариант 1 - отдельный класс-фабрика
		dish = bake.makeDish("cake");
		System.out.println(dish.taste());

		dish = bake.makeDish("pie");
		System.out.println(dish.taste());

		// Вариант 2 - фабричный метод прямо внутри абстрактного класса
		dish = Dish.getInstance("cake");
		System.out.println(dish.taste());

		dish = Dish.getInstance("pie");
		System.out.println(dish.taste());
	}

}
