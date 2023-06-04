package com.userdefinedDataStructures;

import java.util.Iterator;
import java.util.*;
public class StackLLDemo<T> {
	public static void main(String[] args) {
		
		StackLL<Double> lstk = new StackLL<>();   
		Scanner sc= new Scanner(System.in);
		do {
		System.out.print("1.push\n2.pop\n3.peek\n4.display\n5.exit\n");
		System.out.println("enter your choice: ");
		int choice = sc.nextInt();
        switch (choice) {
			case 1 : 
				          System.out.println("Enter the element to insert:");
				          double ele = sc.nextInt();
				          lstk.push(ele);
					      break;
			case 2:System.out.println("Deleted element :"+ lstk.pop()); 
			            	break;
			case 3: System.out.println("The topmost element of stack :"+ lstk.peek());
			                break;
			case 4: lstk.display();
						   break;		
			case 5: System.exit(0);
		   
		default:	System.out.println("invalid operation!!");
		}
        
		}
		while(true);
	}
	
}

