package com.uis.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hashSet1 = new HashSet();
		hashSet1.add("abc");
		hashSet1.add("def");
		hashSet1.add("ghi");
		hashSet1.add("jkl");
		hashSet1.add("mno");
		hashSet1.add("pqr");
		HashSet hashSet2 = new HashSet();
		hashSet1.add("abc");
		hashSet1.add("def");
		hashSet1.add("ghi");
		hashSet1.add("jkl");
		hashSet1.add("mno");
		hashSet1.add("pqr");

		// 1. WAP to append the specified element to the end of a HashSet.
//		Object element="abc";
//		HashSetDemo.appendingSpecifiedElelment(hashset1, element);

		// 2. WAP to iterate through all elements in a HashSet.
		 HashSetDemo.iteratHashSet(hashSet1);// doubt

		// 3. WAP to get the number of elements in a HashSet.
		// HashSetDemo.numberOfElements(hashSet1);

		// 4. WAP to empty the HashSet.
		// HashSetDemo.emptyHashSet(hashSet1);

		// 5. WAP to test a HashSet is empty or not.
		// HashSetDemo.IsHashSetEmpty(hashSet1);

		// 6. WAP to clone a HashSet to another HashSet.
		//HashSetDemo.cloneHashSet(hashSet1);

		// 7. WAP to convert a HashSet to an array.
		//9.  WAP to convert a HashSet to a List/ArrayList.
		//HashSetDemo.hashSetToArray(hashSet1);
		
		//8.  WAP to convert a HashSet to a TreeSet.
		HashSetDemo.hashSetToTree(hashSet1);
		
		//10.WAP to compare two HashSet.
		HashSetDemo.compareTwoHash(hashSet1, hashSet2);
		
		//12. WAP to remove all the elements from a HashSet.
		HashSetDemo.removeAllElements(hashSet1);
	}
	public static void removeAllElements(HashSet hash1) {
		hash1.clear();
		System.out.println(hash1);
	}
  public static void compareTwoHash(HashSet hash1,HashSet hash2) {
	  System.out.println(hash1.equals(hash2));//why ,false?
  }
	public static void hashSetToTree(HashSet hash1) {
		TreeSet tree1=new TreeSet(hash1);
		System.out.println(tree1);
	}
	public static void hashSetToArray(HashSet hashSet1) {
		ArrayList list1 = new ArrayList(hashSet1);
	     int[] a1=new int[list1.size()];
	     
		System.out.println(list1);
	}

	public static void cloneHashSet(HashSet hashSet1) {
		HashSet hashSet2 = new HashSet();
		Object o = hashSet1.clone();
		System.out.println(o);
	}

	public static void appendingSpecifiedElelment(HashSet hashset1, Object element) {
		System.out.println(hashset1.add(element));
	}

	public static void emptyHashSet(HashSet hashSet1) {
		hashSet1.clear();
		System.out.println(hashSet1);
	}

	public static void IsHashSetEmpty(HashSet hashSet1) {
		System.out.println(hashSet1.isEmpty());

	}

	public static void iteratHashSet(HashSet hashset1) {
		Iterator iterator = hashset1.iterator();
		System.out.print("[");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("]");
	}

	public static void numberOfElements(HashSet hashSet1) {
		System.out.println(hashSet1.size());
	}
}
