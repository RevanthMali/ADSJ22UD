package com.userdefinedDataStructures;

import java.util.Scanner;

public class UStackDemo {

	public static void main(String[] args) {

	    UStack<Double> stk = new UStack<>();   
		Scanner sc= new Scanner(System.in);
		do {
		System.out.print("1.push\n2.pop\n3.peek\n4.display\n5.exit\n");
		System.out.println("enter your choice: ");
		int choice = sc.nextInt();
        switch (choice) {
			case 1 : 
				          System.out.println("Enter the element to insert:");
				          double ele = sc.nextDouble();
				          stk.push(ele);
					      break;
			case 2:System.out.println("Deleted element :"+ stk.pop()); 
			            	break;
			case 3: System.out.println("The first element of the queue  :"+ stk.peek());
			                break;
			case 4: stk.display();
						   break;		
			case 5: System.exit(0);
		   
		default:	System.out.println("invalid operation!!");
		}
		}while(true);

	}

}
