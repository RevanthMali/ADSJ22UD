package generics;

public class SortedListDemo {
   public static void main(String[] args) {
	   	SortedList<Integer> ilist = new SortedList<>(); 
	   	ilist.add(5);
	   	ilist.add(14);
	   	ilist.add(10);
	   	ilist.add(9);
	   	ilist.add(0);
	   	ilist.Display(); 
	   	SortedList<String> slist = new SortedList<>();  
	   	slist.add("B");
	   	slist.add("A");
	   	slist.add("Z");
	   	slist.add("E");
	   	slist.add("O"); 
	   	slist.Display();
	}

}
