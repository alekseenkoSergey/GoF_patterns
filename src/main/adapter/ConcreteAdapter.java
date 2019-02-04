package main.adapter;

public class ConcreteAdapter implements Adapter {

	private Adaptee adaptee;

	public ConcreteAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void prettyOperationName() {
		adaptee.uglyOperationName();
	}
}
