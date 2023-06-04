package generics;
public class Product implements Comparable{
  private int id;
  private String name;
  public Product(){};
  public Product(int id,String name) {
	  this.id = id;
	  this.name= name; 
  }
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + "]";
}

@Override
public int compareTo(Object o) {
	Product p = (Product)o;
	return name.compareTo(p.name);
}
}
