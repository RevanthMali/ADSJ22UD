package com.userdefinedDataStructures;

import java.util.Iterator;
import java.util.*;
public class QueueLLDemo<T> {
	public static void main(String[] args) {
		
		QueueLL<Double> lque = new QueueLL<>();   
		Scanner sc= new Scanner(System.in);
		do {
		System.out.print("1.enqueue\n2.dequeue\n3.peek\n4.display\n5.exit\n");
		System.out.println("enter your choice: ");
		int choice = sc.nextInt();
        switch (choice) {
			case 1 : 
				          System.out.println("Enter the element to insert:");
				          double ele = sc.nextDouble();
				           lque.enqueue(ele);
					      break;
			case 2:System.out.println("Deleted element :"+ lque.dequeue()); 
			            	break;
			case 3: System.out.println("The first element of the queue  :"+ lque.peek());
			                break;
			case 4: lque.Display();
						   break;		
			case 5: System.exit(0);
		   
		default:	System.out.println("invalid operation!!");
		}
		}while(true);
	}
}
