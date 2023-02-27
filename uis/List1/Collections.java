package com.uis.List1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.Element;



public class Collections {

	public static void main(String[] args) {
		ArrayList inputList = new ArrayList(5);
		inputList.add(10);
		inputList.add(20);
		inputList.add(30);
		inputList.add(40);
		inputList.add(50);
		
		
		ArrayList inputList2 = new ArrayList(5);
		inputList2.add(10);
		inputList2.add(20);
		inputList2.add(30);
		inputList2.add(40);
		inputList2.add(50);
		
		//WAP to create a new ArrayList, add some colours (String) and PRINT out the collection
		//Collections.printListElements(inputList);
		
		//WAP to ITERATE through all elements & MULTIPLY BY 2 in an ArrayList.
		//System.out.println("Before Iterating : "+ inputList);
		//Collections.iterateAllElements(inputList);
		
		//3. WAP to insert an element into the ArrayList at the FIRST position.
//		Object o=new Object();
//		o="red";
//		Collections.insertAnElementAt0(inputList, o);
		
		//WAP to RETRIEVE an element (at a SPECIFIED INDEX) from a given ArrayList.
//		int index =2;
//		Collections.retriveAnElement(inputList, index);
		
		//5. WAP to UPDATE SPECIFIC ELEMENT by given element.
//		Object o=new Object();
//     	o="red";
//		Collections.updateSpecificElement(inputList, o);
		
		//6. WAP to REMOVE THIRD ELEMENT from an ArrayList
		//Collections.removeThirdElement(inputList);
		
		//7. WAP to SEARCH AN ELEMENT in an ArrayList.
//		Object o=new Object();
//		o="red";
//		Collections.searchElement(inputList, o);
		
		//8. WAP to COPY ONE ARRAYLIST INTO ANOTHER.
		//Collections.copyArrayListToAnother(inputList);
		
		//9. WAP to EXTRACT A PORTION OF AN ARRAYLIST.
//		int fromIndex=2;
//		int toIndex=5;
//		Collections.extractList(inputList, fromIndex, toIndex);
		
		//10.WAP to compare two ArrayList
		Collections.compareTwoArrayList(inputList, inputList2);
	}

	public static void printListElements(List list) {

		System.out.println(list);
	}
	public static void iterateAllElements(List list) {

				for(int i =0;i<list.size();i++) {
					int num = (int) list.get(i);
					System.out.print(2 * num+" ");
				}
				System.out.println();
	}
	public static void insertAnElementAt0(List list,Object o) {
		System.out.println(" original list:"+list);
		list.add(0, o);
		
		System.out.println("after adding element"+list);
	}
	public static void retriveAnElement(List list ,int index) {
		System.out.println(list.get(index));
	}
	public static void updateSpecificElement(List list ,Object o) {
		//list[2]=o;
		System.out.println(" original list:"+list);
		list.set(2, o);
		System.out.println("after adding element"+list);
		}
	public static void removeThirdElement(List list) {
		System.out.println(" original list:"+list);
		list.remove(2);
		System.out.println("after adding element"+list);
		}
	
	public static void searchElement(List list,Object o) {
		System.out.println(" original list:"+list);
		
		if (list.contains(o)) {
			System.out.println(o+" is present in list");
		} else {
			System.out.println(o+" is not present in list");
		}
		}
	
	public static void copyArrayListToAnother(List list) {
		System.out.println(" original list:"+list);
		ArrayList list2=new ArrayList(list.size());
		list2.addAll(list);
		System.out.println("copied array list is"+list);
		}
	
	public static void extractList(List list,int fromIndex,int toIndex) {
		System.out.println(" original list:"+list);
		
		System.out.println("extracted portion of array list is"+list.subList(fromIndex, toIndex));
		}
	
	public static void compareTwoArrayList(ArrayList list1,ArrayList list2) {
		//System.out.println(" original list:"+list1);
	
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).equals(list2.get(i))) {
				System.out.print(" yes ");
			} else {
				System.out.print(" no ");
			}
		}
		}
	}


