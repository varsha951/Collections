package com.uis.Q2;

import java.util.HashSet;

public class TesterClass {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("BMW", 100);
		Vehicle v2 = new Vehicle("BENZ", 100);
//		Vehicle v2 = new Vehicle("BMW", 100);
//		System.out.println(v1);
//		System.out.println(v2);
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode()==v2.hashCode());
		
/*3) Create a HashSet. Add vehicle objects to it. Create a new vehicle object with an earlier 
created name and engine capacity. Try to add this to the set. Remember this should 
not be allowed as it is a duplicate. If it is allowing, why so? invoke hashCode() method 
on both the objects and SOP the returned values. Are they the same? Now do you understand why set is allowing duplicates?
Override hashCode() method in Vehicle class and see if the same behaviour still persists 
in the tester class. Put SOPs in equals() and hashCode() so you understand the control 
flow.*/

		HashSet set1 = new HashSet<>();
		
		System.out.println(set1.add(v1));
		System.out.println(set1.add(v2));
		System.out.println(set1);
		
		Vehicle v3 = new Vehicle("BMW", 100);
		System.out.println(set1.add(v3));
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(v3.hashCode());
		
		
		
		
		
	}

}
