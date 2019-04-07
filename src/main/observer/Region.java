package main.observer;

public class Region implements Observer {

	private String name;

	public Region(String name) {
		this.name = name;
	}

	@Override
	public void update(int stormPower) {
		System.out.println(stormPower + " point storm is coming in region " + name);
	}
}
