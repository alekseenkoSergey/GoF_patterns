package main.command.commands;

import main.command.Pizza;

public class AddBaconCommand implements Command {

	private Pizza pizza;

	public AddBaconCommand(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void execute() {
		pizza.addBacon();
	}

	@Override
	public void undo() {
		pizza.removeBacon();
	}
}
