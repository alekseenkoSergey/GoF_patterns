package main.command.commands;

import main.command.Pizza;

public class AddTomatoCommand implements Command {

	private Pizza pizza;

	public AddTomatoCommand(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void execute() {
		pizza.addTomato();
	}

	@Override
	public void undo() {
		pizza.removeTomato();
	}
}
