package main.command.commands;

import main.command.Pizza;

public class AddMushroomsCommand implements Command {

	private Pizza pizza;

	public AddMushroomsCommand(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void execute() {
		pizza.addMushrooms();
	}

	@Override
	public void undo() {
		pizza.removeMushrooms();
	}
}
