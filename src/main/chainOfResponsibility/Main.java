package main.chainOfResponsibility;

import main.chainOfResponsibility.handler.FinalHandler;
import main.chainOfResponsibility.handler.FirstHandler;
import main.chainOfResponsibility.handler.SecondHandler;
import main.chainOfResponsibility.handler.ThirdHandler;

public class Main {

	public static void main(String[] args) {
		FinalHandler finalHandler = new FinalHandler(null);
		ThirdHandler thirdHandler = new ThirdHandler(finalHandler);
		SecondHandler secondHandler = new SecondHandler(thirdHandler);
		FirstHandler firstHandler = new FirstHandler(secondHandler);

		Event event = new Event(1, "Smth 1");
		firstHandler.process(event);

		event = new Event(2, "Smth 2");
		firstHandler.process(event);

		event = new Event(3, "Smth 3");
		firstHandler.process(event);

		event = new Event(4, "Smth 4");
		firstHandler.process(event);
	}
}
