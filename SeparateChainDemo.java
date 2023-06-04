package com.datastructures.userdefined;
import java.util.*;
public class SeparateChainDemo {
	public static void main(String[] args) {      
           SeperateChaining<Integer,String> LL=new  SeperateChaining<>(10);         
	  do {
		  System.out.println(" 1.put\n 2.remove\n 3.get\n 4.contains\n 5.dispaly\n 6.exit\n");
		  System.out.println("Enter the choice:");
		  Scanner sc=new Scanner(System.in); 
		  int choice=sc.nextInt();
		     switch(choice) {
		     case 1:System.out.println("Enter the key and value to insert:");
		                Integer key=sc.nextInt();
		                String value=sc.next();
		                LL.put(key, value);
		                break;
		     case 2 : System.out.println("Enter the key to be deleted");
		                  key=sc.nextInt();
		                 System.out.println("The del value associated with key:"+LL.remove(key));
		                  break;
		     case 3:  System.out.println("Enter the key to search");
		                  key=sc.nextInt();
		                  System.out.println("The value associated with key:"+LL.get(key));
		                  break;
		     case 4:System.out.println("Enter the key to search");
                            key=sc.nextInt();
                         if(true==LL.contains(key)) {
            	              System.out.println("key is found");}
                        else
                              System.out.println("key is not found");
                         break; 
		     case 5:LL.display();
		                break;
		     case 6:System.exit(0);
		                break;             
		 default: System.out.println("Invalid choice!");
		 		  } 
		 	  }while(true);
		 	}
}
