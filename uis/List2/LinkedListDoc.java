package com.uis.List2;

import java.util.LinkedList;

public class LinkedListDoc {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		//1. WAP to append the specified element to the end of a LinkedList.
         list.add("red");
         list.add("green");
         list.add("black");
         list.add("white");
         list.add("pink");
         list.add("yellow");
         
         //System.out.println(list);
         
         //2. WAP to iterate through all elements in a LinkedList.
         //LinkedListDoc.iterateAllElements(list);
         
         //5. WAP to insert the specified element at the specified position in the LinkedList.
         int pos=3;
         Object o=new Object();
         o="purple";
         LinkedListDoc.insertElementsAtSpecifiedPosition(list, pos, o);
         
	}
	public static void iterateAllElements(LinkedList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+":"+i+" ");
		}
		System.out.println();
	}
	
	public static void insertElementsAtSpecifiedPosition(LinkedList list,int pos,Object element) {
		list.add(pos, element);
		System.out.println(list);
	}

}

