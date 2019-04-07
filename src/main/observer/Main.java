package main.observer;

public class Main {

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();

		Region regionA = new Region("A");
		Region regionB = new Region("B");

		station.addObserver(regionA);
		station.addObserver(regionB);

		station.receiveData(1);
		station.receiveData(5);
		station.receiveData(3);
		station.receiveData(2);
		station.receiveData(10);
	}
}
