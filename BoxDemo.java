package generics;
public class BoxDemo {
	public static void main(String[] args) {
	   System.out.println("before modifications: ");
	   Box <Integer> i = new Box<>(300); 
	   Box <String> str = new Box<>("Hello World"); 
	   System.out.println(i);
	   System.out.println(str); 
	   System.out.println("After modifications:"); 
	   int ival = i.getData();
	   ival /= 2;
	   i.setData(ival);
	   System.out.println(i);
	   String strVal = str.getData(); 
	   strVal = strVal.toUpperCase();
	   str.setData(strVal);
	   System.out.println(str);
	}
}
