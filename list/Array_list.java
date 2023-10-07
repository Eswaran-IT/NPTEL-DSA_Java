package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Array_list {
    public static void main(String[] args) {
		System.out.println("Array list in java");
		 // declare 
		ArrayList<Integer> obj1=new ArrayList<>();
		//no worry about size 3 it can be resized by own
		ArrayList<Integer> obj2=new ArrayList<>(3);
		obj2.add(0,22);
		obj2.add(1,24);
		obj2.add(2,44);
		obj2.add(3,27);
		System.out.println(obj2);
		obj1.add(2);
		obj1.add(3);
		obj1.add(5);
		obj1.add(6);
		System.out.println(obj1);
		//add at that index of values of collections
		obj1.addAll(0, obj2);
		System.out.println(obj1);
		//check present value by true or false
	System.out.println(obj1.contains(3));
	//checks all present or not
	System.out.println(obj1.containsAll(obj2));
	//get value by index also we can set
	System.out.println(obj1.get(0));
	//hash vlaue in memory
	System.out.println(obj1.hashCode());
	//bool type
	System.out.println(obj1.isEmpty());
	//remove at index
	System.out.println(obj1.remove(3));
	System.out.println(obj1);
	//remove by collections
	System.out.println(obj1.removeAll(obj2));
	System.out.println(obj1);
	//clear all data
	obj1.clear();
	System.out.println(obj1);
	//substring creation
   ArrayList<Integer> obj3=new ArrayList<Integer>(obj2.subList(0, 3));
	System.out.println(obj3);
	//trim by the data size in the list
	obj3.trimToSize();
	
	
	
	/* 
	 * comparator=> interface  has one method compareTo 
	 * and has predef func like ascen,descen,reverse
	 * returns int value as positive,negative,zero
	 * it sorts the data of list items passed to it*/
	
	 List<Integer> numbers = new ArrayList<>();
     numbers.add(5);
     numbers.add(2);
     numbers.add(8);
     numbers.add(1);

     // Create a Comparator to sort numbers in reverse order
     Comparator<Integer> reverseComparator = (num1, num2) -> num2.compareTo(num1);

     // Sort the list of numbers using the reverseComparator
     Collections.sort(numbers, reverseComparator);

     // Print the sorted list
     for (Integer number : numbers) {
         System.out.println(number);
     }
	
	
	
		
		
		
		
	}
}
