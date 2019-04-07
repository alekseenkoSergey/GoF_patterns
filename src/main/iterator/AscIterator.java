package main.iterator;

import java.util.Iterator;
import java.util.Set;

public class AscIterator<T extends Comparable> implements Iterator<T> {

	private Set<T> set;

	private int returned = 0;
	private T lastReturned;

	public AscIterator(Set<T> set) {
		this.set = set;
	}

	@Override
	public boolean hasNext() {
		return set.size() > returned;
	}

	@Override
	public T next() {
		Iterator<T> iter = set.iterator();

		T min = iter.next();
		while (iter.hasNext()) {
			T next = iter.next();
			if (next.compareTo(min) > 0) {
				min = next;
			}
		}
		return min;
	}
}
