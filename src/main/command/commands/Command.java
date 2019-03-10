package main.command.commands;

import main.command.Pizza;

public interface Command {

	void execute();

	void undo();

}
