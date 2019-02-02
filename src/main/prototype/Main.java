package main.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		HeavyObject heavyObject = new HeavyObject("a1", "b1", "c1");
		Object clone = heavyObject.clone();
		System.out.println(clone);
		System.out.println(heavyObject == clone);
		System.out.println(heavyObject.equals(clone));
	}
}
