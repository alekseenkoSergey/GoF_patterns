package main.command;

import main.command.commands.AddBaconCommand;
import main.command.commands.AddCheeseCommand;
import main.command.commands.AddMushroomsCommand;
import main.command.commands.BakePizzaCommand;

public class Main {

	public static void main(String[] args) {
		Cook cook = new Cook();
		Pizza pizza = new Pizza();

		cook.addCommand(new AddBaconCommand(pizza));
		cook.addCommand(new AddMushroomsCommand(pizza));
		cook.addCommand(new AddCheeseCommand(pizza));
		cook.addCommand(new BakePizzaCommand(pizza));

		cook.executeAll();
	}
}
