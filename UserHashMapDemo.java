 package com.datastructures.userdefined;
import java.util.*;
public class UserHashMapDemo {
	public static void main(String[] args) {
       
		UserHashMap<Integer,String> Lprobe=new UserHashMap<>();
         
	  do {
		  System.out.println(" 1.put\n 2.remove\n 3.get\n 4.dispaly\n 5.exit\n");
		  System.out.println("Enter the choice:");
		  Scanner sc=new Scanner(System.in); 
		  int choice=sc.nextInt();
		     switch(choice) {
		     case 1:System.out.println("Enter the key and value to insert:");
		                Integer key=sc.nextInt();
		                String value=sc.next();
		                if(true==Lprobe.put(key,value))
		                	System.out.println("Inserted succesfully in the Hashtable");
		                else
		                	System.out.println("Insertion failed in the Hashtable");
		                break;
		     case 2 : System.out.println("Enter the key to be deleted");
		                  key=sc.nextInt();
		                 System.out.println("The del value associated with key:"+Lprobe.remove(key));
		                  break;
		     case 3:  System.out.println("Enter the key to search");
		                  key=sc.nextInt();
		                  System.out.println("The value associated with key:"+Lprobe.get(key));
		                  break;
		     case 4:Lprobe.display();
		                break;
		     case 5:System.exit(0);
		                  break;
		     default: System.out.println("Invalid choice!");
		  } 
	  }while(true);
	}
}