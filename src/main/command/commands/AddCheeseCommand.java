package main.command.commands;

import main.command.Pizza;

public class AddCheeseCommand implements Command {

	private Pizza pizza;

	public AddCheeseCommand(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void execute() {
		pizza.addCheese();
	}

	@Override
	public void undo() {
		pizza.removeCheese();
	}
}
