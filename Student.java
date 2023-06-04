package generics;
public class Student {
	private int id;
	private String name;
	public Student() {};
	public Student(int id,String name) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	} 
	
}
