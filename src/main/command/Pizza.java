package main.command;

public class Pizza {

	private int bacon;
	private int cheese;
	private int tomato;
	private int mushrooms;
	private int pepper;

	public void addBacon() {
		bacon++;
	}

	public void removeBacon() {
		if (bacon == 0) {
			throw new IllegalArgumentException("Number of bacon is 0");
		}
		bacon--;
	}

	public void addCheese() {
		cheese++;
	}

	public void removeCheese() {
		if (cheese == 0) {
			throw new IllegalArgumentException("Number of cheese is 0");
		}
		cheese--;
	}

	public void addTomato() {
		tomato++;
	}

	public void removeTomato() {
		if (tomato == 0) {
			throw new IllegalArgumentException("Number of tomato is 0");
		}
		tomato--;
	}

	public void addMushrooms() {
		mushrooms++;
	}

	public void removeMushrooms() {
		if (mushrooms == 0) {
			throw new IllegalArgumentException("Number of mushrooms is 0");
		}
		mushrooms--;
	}

	public void addPepper() {
		pepper++;
	}

	public void removePepper() {
		if (pepper == 0) {
			throw new IllegalArgumentException("Number of pepper is 0");
		}
		pepper--;
	}

	@Override
	public String toString() {
		return "Pizza{" +
				"bacon=" + bacon +
				", cheese=" + cheese +
				", tomato=" + tomato +
				", mushrooms=" + mushrooms +
				", pepper=" + pepper +
				'}';
	}

}
