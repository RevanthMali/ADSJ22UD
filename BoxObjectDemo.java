package generics;
public class BoxObjectDemo {
	 public static void main(String[] args) {
	System.out.println("before modifications :");
	BoxObject i = new BoxObject(90); 
	BoxObject str = new BoxObject("Generics"); 
	System.out.println(i); 
	System.out.println(str);
	System.out.println("After modifications"); 
	int ival = (int)i.getData();
	ival +=10;
	i.setData(ival); 
	System.out.println(i); 
	String strVal = (String)str.getData();
    strVal = strVal.toUpperCase();
    str.setData(strVal);
    System.out.println(str);
	}
}
