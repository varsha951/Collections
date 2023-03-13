package com.uis.treeset;

import java.util.Comparator;

public class LessThanOrEqual implements Comparator {
	Integer specificElement;

	public LessThanOrEqual(Integer specificElement) {
		super();
		this.specificElement = specificElement;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < specificElement || i1 == specificElement) {
			return 1;
		} else {
			return 0;
		}
	}
}
