package main.abstractFactory.kitchens;

import main.abstractFactory.dishes.FirstDish;
import main.abstractFactory.dishes.JapaneseFirstDish;
import main.abstractFactory.dishes.JapaneseSecondDish;
import main.abstractFactory.dishes.SecondDish;

public class JapaneseKitchen implements Kitchen {
	@Override
	public FirstDish makeFirstDish() {
		return new JapaneseFirstDish();
	}

	@Override
	public SecondDish makeSecondDish() {
		return new JapaneseSecondDish();
	}
}
