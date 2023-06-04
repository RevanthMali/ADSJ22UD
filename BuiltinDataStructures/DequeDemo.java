package com.BuiltinDataStructures;
import java.util.*;
public class DequeDemo {
	public static void main(String[] args) {
		Deque<Integer> dque = new LinkedList<>();
		dque.addFirst(10);
		dque.addFirst(20);
		dque.addFirst(30);
		dque.addLast(40);
		System.out.println(dque); 
	//Peek operations
        System.out.println("First element: "+ dque.getFirst());
        System.out.println("Last element: "+dque.getLast());
     //Dequeue operations
        System.out.println("Removed First element: "+dque.removeFirst());
        System.out.println("Removed Last element: "+dque.removeLast());
        System.out.println(dque);
	}
}
