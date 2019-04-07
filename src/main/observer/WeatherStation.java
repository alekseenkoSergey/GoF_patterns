package main.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

	private int stormPower;
	private List<Observer> observers = new ArrayList<>();


	public void receiveData(int newStormPower) {
		stormPower = newStormPower;
		if (stormPower >= 3) {
			notifyObservers();
		}
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	private void notifyObservers() {
		observers.forEach(obs -> obs.update(stormPower));
	}


}
