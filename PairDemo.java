package generics;
import java.util.*;
public class PairDemo {
       public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter xcart size :"); 
		int n = sc.nextInt();
		sc.nextLine();
		Pair[] cart = new Pair[n]; 
		int cartQuantity = 0;
		for(int i= 0;i<n;i++) {
			System.out.println("Enter productname and quantity :"); 
			String name = sc.nextLine();    
			int qty = sc.nextInt();
			sc.nextLine(); 
			cartQuantity +=qty;
			cart[i] = new Pair<String,Integer>(name,qty);
		} 
		for(Pair product :cart) {
			System.out.println(product); 
		} 
		System.out.println("Total products in the cart are :"+cartQuantity);
       }
}
