package main.iterator;

import java.util.Iterator;
import java.util.Set;

public class BigSet<T extends Comparable> {

	private Set<T> set;

	public BigSet(Set<T> set) {
		this.set = set;
	}


	Iterator<T> getAscIterator() {
		return new AscIterator<T>(set);
	}

	Iterator<T> getDescIterator() {
		return new DescIterator(set);
	}
}
