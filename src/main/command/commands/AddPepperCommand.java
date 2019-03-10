package main.command.commands;

import main.command.Pizza;

public class AddPepperCommand implements Command {

	private Pizza pizza;

	public AddPepperCommand(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void execute() {
		pizza.addPepper();
	}

	@Override
	public void undo() {
		pizza.removePepper();
	}
}
