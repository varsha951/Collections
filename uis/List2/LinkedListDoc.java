package com.uis.List2;

import java.util.LinkedList;

public class LinkedListDoc {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		LinkedList list2=new LinkedList();
		
		//1. WAP to append the specified element to the end of a LinkedList.
         list.add("red");
         list.add("green");
         list.add("black");
         list.add("white");
         list.add("pink");
         list.add("yellow");
         list2.add("hello");
         list2.add("hell");
         list2.add("hel");
         list2.add("he");
         list2.add("h");
         list2.add("");
         
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
//        int pos=3;
//         LinkedListDoc.insertElementsAtSpecifiedPosition(list, pos);
         
         //10.WAP to get the first and last elements in a LinkedList.
        // LinkedListDoc.getFirstAndLastElement(list);
         
         //11.WAP to display the elements and their positions in a LinkedList.
        // LinkedListDoc.getElementsAndIndex(list);
         
         //12.WAP to remove a specified element from a LinkedList.
        // Object o=new Object();
   //      o="red";
     //    LinkedListDoc.removeAnElement(list, o);
         
         //13.WAP to remove the first and last element from a LinkedList.
         //LinkedListDoc.removeFirstAddLast(list);
         
         //14.WAP to remove all the elements from a LinkedList.
         //LinkedListDoc.RemoveAllTheElements(list);
         
         //15.WAP of swap two elements in a LinkedList.
         
         
         
         //16. WAP to shuffle the elements in a LinkedList.
         
         
         
         //17. WAP to join two LinkedLists.
         //LinkedListDoc.joinTwoLists(list, list2);
         
         //19. WAP to remove and return the first element of a LinkedList.
         System.out.println(LinkedListDoc.removeAndReturnFirst(list));
	}
	
//	public static void swapingTwoElements(LinkedList list) {
//		System.out.println("before swaping :"+list);
//		list.so
//	}
	
	public static Object removeAndReturnFirst(LinkedList list) {
		return list.pop();
	}
	
	public static void joinTwoLists(LinkedList list1,LinkedList list2) {
		LinkedList list_1=list1;
		LinkedList list_2=list2;
		
		list1.addAll(list2);
		System.out.println(list1);
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
	public static void removeFirstAddLast(LinkedList list) {
		System.out.println("before removal :"+list);
		list.removeFirst();
		list.removeLast();
		
		System.out.println("after removal :"+list);
	}
	public static void RemoveAllTheElements(LinkedList list) {
		System.out.println("before removal :"+list);
		list.clear();
		
		System.out.println("after removal :"+list);
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
	public static void getFirstAndLastElement(LinkedList list) {
		System.out.println("first element :"+list.getFirst());
		System.out.println(" Last element :"+list.getLast());
	}
	public static void removeAnElement(LinkedList list,Object o) {
		System.out.println("before removal :"+list);
		list.remove(o);
		System.out.println(" after removal :"+list);
	}
	
	public static void getElementsAndIndex(LinkedList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+":"+i+" ");
		}
		System.out.println();
	}

}

