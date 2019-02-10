package main.decorator;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	private List<String> components = new ArrayList<>();


	public void addComponent(String component) {
		components.add(component);
	}

	public List<String> getComponents() {
		return components;
	}

	@Override
	public String toString() {
		return "I am Pizza of: " + components;
	}
}
