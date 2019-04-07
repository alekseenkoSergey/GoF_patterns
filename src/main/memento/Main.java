package main.memento;

public class Main {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();

		Originator originator = new Originator("BlaBla1");
		caretaker.save(originator);

		originator.setText("Ololo2");
		caretaker.save(originator);

		originator.setText("PumPumPum3");
		caretaker.save(originator);


		Originator restored = caretaker.restore(0, originator);
		System.out.println(restored);

		restored = caretaker.restore(1, originator);
		System.out.println(restored);

		restored = caretaker.restore(2, originator);
		System.out.println(restored);
	}
}
