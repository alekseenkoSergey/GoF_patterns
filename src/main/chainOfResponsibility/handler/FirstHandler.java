package main.chainOfResponsibility.handler;

import main.chainOfResponsibility.Event;

public class FirstHandler extends Handler {

	public FirstHandler(Handler successor) {
		super(successor);
	}

	@Override
	public void process(Event event) {
		if (event.getType() == 1) {
			System.out.println("First handler processed event: " + event);
		} else {
			continueProcess(event);
		}
	}
}
