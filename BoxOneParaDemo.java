package generics;
public class BoxOneParaDemo {
	public static void main(String[] args) {
		 Box <Integer> b1 = new Box<>(100);
		 Box <String> b2 = new Box<>("Generics ");
		 Box <Student> b3 = new Box<>(new Student(101,"Rajuuuu")); 
		 System.out.println(b1);
		 System.out.println(b2);
		 System.out.println(b3);

		 int ival =  b1.getData();
		 ival *= 2;
		 b1.setData(ival);
		 System.out.println(b1);
		 String strVal = b2.getData();
		 strVal = strVal.concat("concept in java");
		 b2.setData(strVal);
		 System.out.println(b2); 
		 b3.setData(new Student(102,"royyyyyy"));
		 System.out.println("After updations :"); 
		 System.out.println(b1);
		 System.out.println(b2);
		 System.out.println(b3);

	}
}
