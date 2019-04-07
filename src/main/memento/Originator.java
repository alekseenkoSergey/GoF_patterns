package main.memento;

public class Originator {

	private String text;
	private int version = 0;

	public Originator(String text) {
		this.text = text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public void setMemento(Memento memento) {
		memento.unpack();
	}

	public Memento createMemento() {
		return new Memento(this);
	}

	@Override
	public String toString() {
		return "Originator{" +
				"text='" + text + '\'' +
				'}';
	}


	public class Memento {

		private String storingText;
		private int storedVersion;

		private Memento(Originator originator) {
			storingText = originator.text;
			storedVersion = originator.version;
			version++;
		}

		private void unpack() {
			text = storingText;
		}

		public int getStoredVersion() {
			return storedVersion;
		}
	}

}
