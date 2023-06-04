package com.userdefinedDataStructures;

import java.util.Scanner;

public class UQueueDemo<E> {
	public static void main(String[] args) {
		UQueue<Double> Aque = new UQueue<>();   
		Scanner sc= new Scanner(System.in);
		do {
		System.out.print("1.enqueue\n2.dequeue\n3.peek\n4.display\n5.size\n6.exit\n");
		System.out.println("enter your choice: ");
		int choice = sc.nextInt();
        switch (choice) {
			case 1 : 
				          System.out.println("Enter the element to insert:");
				          double ele = sc.nextDouble();
				           Aque.enqueue(ele);
					      break;
			case 2:System.out.println("Deleted element :"+ Aque.dequeue()); 
			            	break;
			case 3: System.out.println("The first element of the queue  :"+ Aque.peek());
			                break;
			case 4: Aque.display();
						   break;	 
			case 5 : System.out.println("Queue size :"+ Aque.size()); 
							break;
			case 6: System.exit(0);
		   
		default:	System.out.println("invalid operation!!");
		}
		}while(true);
	}
}
