package com.uis.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	TreeSet set1=new TreeSet();
	set1.add("apple");
	set1.add("cat");
	set1.add("ball");
	set1.add("dog");
	set1.add("elephant");
	set1.add("frog");
	TreeSet set2=new TreeSet();
	set2.add("apple");
	set2.add("cat");
	set2.add("ball");
	set2.add("dog");
	set2.add("elephant");
	set2.add("frog");
	
		//1.WAP to create a new TreeSet, add some colours (string) and print out the TreeSet.
	//TreeSetDemo.printTreeSet(set1);
       
	//2.WAP to iterate through all elements in a TreeSet.
	//TreeSetDemo.iterateAllElements(set1);
	
	//3.WAP to add all the elements of a specified TreeSet to another TreeSet.
	//TreeSetDemo.addToAnotherSet(set1);
	
	//4.WAP to create a reverse order view of the elements contained in given TreeSet.
	TreeSet set=new TreeSet(new DescendingOrder());
	set.add("apple");
	set.add("cat");
	set.add("ball");
	set.add("dog");
	set.add("elephant");
	set.add("frog");
	//System.out.println(set);
	
	//5.WAP to get the first and last elements in a TreeSet.
	//TreeSetDemo.getFirstElement(set);
	
	//6.WAP to clone a TreeSet list to another TreeSet.
	//TreeSetDemo.cloneSet(set1);
	
	//7.WAP to get the number of elements in a TreeSet.
	//TreeSetDemo.getNumberOfElements(set1);
	
	//8.WAP to compare two TreeSets.
	//TreeSetDemo.compareTwoSets(set1, set2);
	
	//9.WAP to find the numbers less than 7 in a TreeSet.//ask doubt?
//	TreeSet setN=new TreeSet(new NumbersLessthan7());
//	setN.add(1);
//	setN.add(20);
//	setN.add(4);
//	setN.add(5);
//	setN.add(15);
//	setN.add(6);
//	System.out.println(setN);
	
	
	//10.WAP to get the element in a TreeSet which is greater than or equal to the given element.
	//12.WAP to get the element in a TreeSet which is strictly greater than or equal to the given element.
//	TreeSet setN=new TreeSet(new GreaterThanOrEqualToElement(5));
//	setN.add(25);
//	setN.add(20);
//	setN.add(4);
//	setN.add(5);
//	setN.add(15);
//	setN.add(3);
//	System.out.println(setN);
	
	//11.WAP to get the element in a TreeSet which is less than or equal to the given element.
//	TreeSet setN=new TreeSet(new LessThanOrEqual(20));
//	setN.add(25);
//	setN.add(20);
//	setN.add(24);
//	setN.add(5);
//	setN.add(15);
//	setN.add(3);
//	System.out.println(setN);
	
	
	//14.WAP to retrieve and remove the first element of a TreeSet.
	//TreeSetDemo.retrieveAndRemoveFirst(set1);
	
	
	//15.WAP to retrieve and remove the last element of a TreeSet.
	TreeSetDemo.retrieveAndRemoveLast(set1);
	
	//16.WAP to remove a given element from a TreeSet.
	
	}
	
	public static void removeTreeSet() {
		
	}
	public static void retrieveAndRemoveFirst(TreeSet<String> set1) {
		String s1=set1.first();
		set1.st
		set1.remove(set1.first());
		System.out.print(set1);
	}
	public static void retrieveAndRemoveLast(TreeSet<String> set1) {
		String s1=set1.last();
		set1.remove(set1.last());
		System.out.print(set1);
	}
	public static void compareTwoSets(TreeSet set1,TreeSet set2) {
		System.out.println(set1.containsAll(set2));
	}
	public static void getNumberOfElements(TreeSet set1) {
		System.out.println(set1.size());
	}
	public static void cloneSet(TreeSet set1) {
		TreeSet set2=new TreeSet();
		Object o1=set1.clone();
		System.out.println(o1);
	}
	public static void getFirstElement(TreeSet set1) {
		System.out.println("first element "+set1.first());
		System.out.println("last element "+set1.last());
	}
	
	public static void addToAnotherSet(TreeSet set1) {
		TreeSet set2=new TreeSet();
		set2=set1;
		System.out.println(set2);
	}
public static void printTreeSet(TreeSet set1) {
	System.out.println(set1);
}
public static void iterateAllElements(TreeSet set1) {
	Iterator iterate1 = set1.iterator();
	System.out.print("[");
	while (iterate1.hasNext()) {
		System.out.print(iterate1.next()+" ");	
	}
	System.out.println("]");
}
}
