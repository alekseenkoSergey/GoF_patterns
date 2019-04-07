package main.memento;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {

	private Map<Integer, Originator.Memento> db = new HashMap<>();


	public void save(Originator originator) {
		Originator.Memento memento = originator.createMemento();
		db.put(memento.getStoredVersion(), memento);
	}

	public Originator restore(int version, Originator originator) {
		Originator.Memento memento = db.get(version);
		if (memento == null) {
			throw new IllegalArgumentException("There is no such version");
		}
		originator.setMemento(memento);
		return originator;
	}
}
