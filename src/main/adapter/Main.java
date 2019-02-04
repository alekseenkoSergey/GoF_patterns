package main.adapter;

public class Main {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Adapter adapter = new ConcreteAdapter(adaptee);
		adapter.prettyOperationName();
	}
}
