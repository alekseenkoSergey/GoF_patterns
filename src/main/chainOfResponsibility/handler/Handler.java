package main.chainOfResponsibility.handler;

import main.chainOfResponsibility.Event;

public abstract class Handler {

	protected Handler successor;

	public Handler(Handler successor) {
		this.successor = successor;
	}

	public abstract void process(Event event);

	protected void continueProcess(Event event) {
		successor.process(event);
	}
}
