package main.command.commands;

import main.command.Pizza;

public class BakePizzaCommand implements Command {

	private Pizza pizza;

	public BakePizzaCommand(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void execute() {
		System.out.println(pizza.toString());
	}

	@Override
	public void undo() {

	}
}
