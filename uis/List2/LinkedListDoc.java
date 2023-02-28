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
//         int pos=3;
//         Object o=new Object();
//         o="purple";
//         LinkedListDoc.insertElementAtSpecifiedPosition(list, pos, o);
         
         
         //6. WAP to insert elements into the LinkedList at the first and last position.
//         int pos=3;
//        Object o=new Object();
//        o="purple";
//        LinkedListDoc.addFirstAddLast(list, pos, o);
        
        //7. WAP to insert the specified element at the front of a LinkedList.
//        Object o=new Object();
//        o="purple";
//        LinkedListDoc.addToFront(list, o);
         
         //8. WAP to insert the specified element at the end of a LinkedList.
//         Object o=new Object();
//       o="navyBlue";
//      LinkedListDoc.addToEnd(list, o);
//       
       //9. WAP to insert some elements at the specified position into a LinkedList.
        int pos=3;
         LinkedListDoc.insertElementsAtSpecifiedPosition(list, pos);
	}
	public static void iterateAllElements(LinkedList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+":"+i+" ");
		}
		System.out.println();
	}
	
	public static void insertElementAtSpecifiedPosition(LinkedList list,int pos,Object element) {
		list.add(pos, element);
		System.out.println(list);
	}
	public static void addFirstAddLast(LinkedList list,int pos,Object element) {
		list.addFirst(element);
		list.addLast(element);
		
		System.out.println(list);
	}
	public static void addToFront(LinkedList list,Object element) {
		list.offerFirst(element);
		System.out.println(list);
	}
	public static void addToEnd(LinkedList list,Object element) {
		list.addLast(element);
		System.out.println(list);
	}
	public static void insertElementsAtSpecifiedPosition(LinkedList list,int pos) {
		System.out.println("before inserting :"+list);
		list.addAll(pos, list);
		System.out.println(" after inserting :"+list);
	}

}

