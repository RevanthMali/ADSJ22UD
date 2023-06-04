package com.BuiltinDataStructures;
import java.util.HashSet;
import java.util.Scanner;
public class SetDemo<E> {
	public static void main(String[] args) { 
		try (Scanner sc = new Scanner(System.in)) {
			HashSet<Integer> setA = new HashSet<>(); 
			do {
				System.out.println("1.add\n2.remove\n3.display\n4.exit\n"); 
				System.out.println("Enter your choice: ");
				int choice = sc.nextInt();
				switch(choice) {
				case 1 : System.out.println("Enter element to insert :"); 
					           int ele = sc.nextInt();
				               setA.add(ele); 
				                break;
				case 2 : System.out.println("enter element you want to remove: ");
				                ele = sc.nextInt();
				                 if(setA.contains(ele))
				                	 setA.remove(ele);
				                else
				                       System.out.println("element not found to remove");
				               break;
				case 3: System.out.print("[");
					           setA.forEach(elem->System.out.print(elem+" "));  
				               System.out.println("]");
					          break;
				case 4: System.exit(0);
				default : System.out.println("Invalid choice!!");
				}
			}while(true);
		}
	}

}
