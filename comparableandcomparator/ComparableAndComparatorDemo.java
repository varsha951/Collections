package com.uis.comparableandcomparator;

import java.util.TreeSet;

public class ComparableAndComparatorDemo {

	public static void main(String[] args) {
		TreeSet set1 = new TreeSet(new DescendingNumComaparator());
		set1.add(10);
		set1.add(2);
		set1.add(13);
		set1.add(14);
		set1.add(0);
		System.out.println(set1);
	}

}
