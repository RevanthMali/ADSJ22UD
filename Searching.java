package generics;

public class Searching { 
	static int intSearch(Integer[] data,Integer key) {
		for(int i =0;i<data.length;i++)
			 if(data[i].equals(key)) 
				 return i;
		 return -1; 
	}  
	static int stringSearch(String[] data,String key) {
		for(int i =0;i<data.length;i++)
			 if(data[i].equals(key)) 
				 return i;
		 return -1; 
	}  
	static int ObjectSearch(Object[] data,Object key) {
		for(int i =0;i<data.length;i++)
			 if(data[i].equals(key)) 
				 return i;
		 return -1; 
	}
}
