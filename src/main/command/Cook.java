package main.command;

import main.command.commands.Command;

import java.util.*;

public class Cook {

	private Queue<Command> toExecute = new ArrayDeque<>();
	private Stack<Command> executed = new Stack<>();


	public void addCommand(Command command) {
		toExecute.add(command);
	}

	public void removeLast() {
		toExecute.remove();
	}

	public void removeAll() {
		while (!toExecute.isEmpty()) {
			removeLast();
		}
	}

	public void executeOne() {
		Command command = toExecute.remove();
		command.execute();
		executed.push(command);
	}

	public void executeAll() {
		while (!toExecute.isEmpty()) {
			executeOne();
		}
	}

	public void undoOne() {
		Command command = executed.pop();
		command.undo();
		addCommand(command);
	}

	public void undoAll() {
		while (!executed.isEmpty()) {
			undoOne();
		}
	}

	public void deleteOne() {
		Command command = executed.pop();
		command.undo();
	}

	public void deleteAll() {
		while (!executed.isEmpty()) {
			deleteOne();
		}
	}

}
