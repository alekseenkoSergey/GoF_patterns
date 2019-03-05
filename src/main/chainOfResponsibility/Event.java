package main.chainOfResponsibility;

public class Event {

	private int type;

	private String payload;

	public Event(int type, String payload) {
		this.type = type;
		this.payload = payload;
	}

	public int getType() {
		return type;
	}

	public String getPayload() {
		return payload;
	}

	@Override
	public String toString() {
		return "Event{" +
				"type=" + type +
				", payload='" + payload + '\'' +
				'}';
	}
}
