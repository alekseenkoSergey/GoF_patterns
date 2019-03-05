package main.chainOfResponsibility.handler;

import main.chainOfResponsibility.Event;

public class ThirdHandler extends Handler {

	public ThirdHandler(Handler successor) {
		super(successor);
	}

	@Override
	public void process(Event event) {
		if (event.getType() == 3) {
			System.out.println("Third handler processed event: " + event);
		} else {
			continueProcess(event);
		}
	}
}
