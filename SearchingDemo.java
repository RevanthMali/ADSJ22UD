package generics; 

public class SearchingDemo {

	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,5};    
	        int index = Searching.intSearch(arr,5);
	        System.out.println(index);
	        index = Searching.intSearch(arr,0);
	        System.out.println(index);
	        String [ ] strArr = new String[ ] {"one","two","three"}; 
	        index = Searching.stringSearch(strArr, "two");
	        System.out.println(index);
	        index = Searching.stringSearch(strArr, "ten");
	        System.out.println(index);     
	}

}
