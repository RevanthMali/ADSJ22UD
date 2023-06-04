package generics;

public class WildcardDemo {
	public static void main(String[] args) {
		Box<Double> b2 = new Box<>(2.2);
		Box<Integer> b3 = new Box<>(10);
		Box<String> b4 = new Box<>("hi"); 
		display(b2);
		System.out.println(cube(b2));
		display(b3);
		System.out.println(cube(b3));
		display(b4);
		System.out.println(b4);

	}

	private static double cube(Box<? extends Number> b) {
		double res = b.getData().doubleValue();
		return res*res*res;
	}
	private static void display(Box<?> b) {
	  System.out.println(b);      
		
	}

}
