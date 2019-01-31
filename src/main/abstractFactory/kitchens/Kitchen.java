package main.abstractFactory.kitchens;

import main.abstractFactory.dishes.FirstDish;
import main.abstractFactory.dishes.SecondDish;

public interface Kitchen {

	FirstDish makeFirstDish();

	SecondDish makeSecondDish();

}
