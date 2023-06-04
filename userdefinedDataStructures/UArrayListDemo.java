package com.userdefinedDataStructures;

import java.util.*;

public class UArrayListDemo{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);   
		UArrayList<Integer> nums = new UArrayList<>(); 
		UArrayList<String> str = new UArrayList<String>();  
		do {
		System.out.print("1.addelement\n2.addElement by index\n3.display\n4.remove\n5.exit\n");
		System.out.println("enter your choice: ");
		int choice = sc.nextInt();
        switch (choice) {
			case 1 : 
				          System.out.println("Enter the element to insert:");
				          int ele = sc.nextInt();
				          System.out.println(nums.add(ele));
					      break;
			case 2: System.out.println("Enter the index and element:"); 
			              int index = sc.nextInt();
			              ele = sc.nextInt();
			              nums.add(index, ele);
			              break;
			case 3: Iterator<Integer> itr = nums.iterator();
				            while(itr.hasNext())
				            	System.out.print(itr.next() + " "); 
				            System.out.println();
						break;
			case 4: System.out.println("enter element to remove:"); 
						ele = sc.nextInt();		
						System.out.println(nums.remove(new Integer(ele)));
					
				        break;
			case 5: System.exit(0);
		   
		default:	System.out.println("invalid operation!!");
		}
		}while(true);
        
	}

}
