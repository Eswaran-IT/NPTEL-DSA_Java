package list;

import java.util.LinkedList;

public class Linked_list {
	public static void main(String args[]) {
		
	System.out.println("Linked list in Java");
	LinkedList<Integer> oneLinkedList=new LinkedList<Integer>();
	LinkedList<Integer> twoLinkedList=new LinkedList<Integer>();
	//adds the data 
	System.out.println(oneLinkedList.add(1));
	oneLinkedList.add(1,234);
	System.out.println(oneLinkedList);
	
	oneLinkedList.addFirst(45);
	oneLinkedList.addLast(999);
	oneLinkedList.addLast(999);
	System.out.println(oneLinkedList);
	
	twoLinkedList.addAll(oneLinkedList);
	
	System.out.println("Second->"+twoLinkedList);
	System.out.println("First->"+oneLinkedList);
	
	oneLinkedList.addAll(3, twoLinkedList);
	System.out.println("First->"+oneLinkedList);
	System.out.println("Second"+twoLinkedList);
	//hashcode
	System.out.println(oneLinkedList.hashCode());
	System.out.println(twoLinkedList.hashCode());
	
	//delete the data 
	oneLinkedList.addAll(twoLinkedList);
	oneLinkedList.descendingIterator();
	System.out.println(oneLinkedList);
	
	oneLinkedList.clear();
	twoLinkedList.remove(3);
	System.out.println(oneLinkedList);
	
	}

}
