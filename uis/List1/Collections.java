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
		Collections.removeThirdElement(inputList);
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
	}


