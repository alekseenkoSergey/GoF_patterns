package main.chainOfResponsibility.handler;

import main.chainOfResponsibility.Event;

public class SecondHandler extends Handler {

	public SecondHandler(Handler successor) {
		super(successor);
	}

	@Override
	public void process(Event event) {
		if (event.getType() == 2) {
			System.out.println("Second handler processed event: " + event);
		} else {
			continueProcess(event);
		}
	}
}
