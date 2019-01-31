package main.abstractFactory;

import main.abstractFactory.dishes.FirstDish;
import main.abstractFactory.dishes.SecondDish;
import main.abstractFactory.kitchens.JapaneseKitchen;
import main.abstractFactory.kitchens.Kitchen;
import main.abstractFactory.kitchens.UkrainianKitchen;

public class Main {

	public static void main(String[] args) {
		Kitchen kitchen = createKitchen("ukrainian");
		FirstDish firstDish = kitchen.makeFirstDish();
		SecondDish secondDish = kitchen.makeSecondDish();
		System.out.println(firstDish);
		System.out.println(secondDish);

		kitchen = createKitchen("japanese");
		firstDish = kitchen.makeFirstDish();
		secondDish = kitchen.makeSecondDish();
		System.out.println(firstDish);
		System.out.println(secondDish);
	}

	public static Kitchen createKitchen(String name) {
		if ("ukrainian".equals(name)) {
			return new UkrainianKitchen();
		} else if ("japanese".equals(name)) {
			return new JapaneseKitchen();
		} else {
			throw new IllegalArgumentException("Unknown kitchen " + name);
		}
	}

}
