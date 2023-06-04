package generics;

public class GenericArrayDemo {

	public static void main(String[] args) {
		Integer[] arr = {3,4,6,1,8}; 
		GenericArray <Integer> obj1= new GenericArray<> (arr);
			System.out.println(obj1);
			obj1.insert(0, 10);
			System.out.println("After sorting:");
			obj1.sort();
			System.out.println(obj1);
			String[] sarr = {"hello","hi","adhaab","namaste"};
			GenericArray<String> obj2 = new GenericArray<>(sarr); 
			System.out.println(obj2);
			obj2.insert(1, "welcome");
			System.out.println("After sorting :");
			obj2.sort();
			System.out.println(obj2); 
			Product[] products = { new Product(102,"pen"),
													new Product(103,"pencil"),
					                              };
			GenericArray<Product> parr = new GenericArray<>(products);                              
			parr.sort();
			System.out.println(parr);
	}

}
