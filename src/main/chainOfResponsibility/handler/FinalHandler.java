package main.chainOfResponsibility.handler;

import main.chainOfResponsibility.Event;

public class FinalHandler extends Handler {
	public FinalHandler(Handler successor) {
		super(successor);
	}

	@Override
	public void process(Event event) {
		System.out.println("Event wasn't processed: " + event);
	}
}
