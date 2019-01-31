package main.abstractFactory.kitchens;

import main.abstractFactory.dishes.FirstDish;
import main.abstractFactory.dishes.SecondDish;
import main.abstractFactory.dishes.UkrainianFirstDish;
import main.abstractFactory.dishes.UkrainianSecondDish;

public class UkrainianKitchen implements Kitchen {
	@Override
	public FirstDish makeFirstDish() {
		return new UkrainianFirstDish();
	}

	@Override
	public SecondDish makeSecondDish() {
		return new UkrainianSecondDish();
	}
}
