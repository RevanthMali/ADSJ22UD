package com.userdefinedDataStructures;
import java.util.Iterator; 
@SuppressWarnings("unused")
public class UArrayList<E> { 
	private E[] arr;
	private int size;
	public UArrayList() { 
		arr =(E[]) new Object[10];
	} 
	public UArrayList(E arr){ 
		this.arr = (E[]) arr; 
	}  
	public boolean isEmpty(E[] arr) {
		  if(size == 0) 
			  return true;
		return false;
	} 
	public int   indexOf(Object obj ) {
		E key = (E)obj; 
		for(int i=0;i<size;i++) {
			if(key.equals(arr[i])) 
				return i;
		} 
		return -1;
	} 
	public boolean contains(Object obj){ 
		E key = (E)obj;
		for(E ele : arr) {
			if(key.equals(ele)) 
				 return true;
		} 
		return false;		
	} 
	public boolean add(E ele) {
		if(size == arr.length)
			return false;
		arr[size++] =ele;
		return true;
	}
	public boolean add(int index,E ele) {
		if(size == arr.length)
			return false;
		else if(index < 0|| index >size) 
			return false;
		else {
			  for(int i= size;i>index;i--)
				  arr[i] = arr[i-1];
			  arr[index] = ele;
			  size++; 
			  return true;
		}  		
	} 
   public Iterator<E> iterator(){
	   return new Iterator<E>(){ //Anonymous object 
       private int it =0;
		@Override
		public boolean hasNext() {	
			return it<size;
		}
		@Override
		public E next() {
			return arr[it++];
		} 
   };   	
 }  
   public boolean remove(Object obj) { 
	   if(size == 0)
		    return false;
	   else {
		   int index = indexOf((E)obj); 
		   if(index == -1)
			   	return false;
		   else {
			    remove(index);
                return true;
		   }
	   }   
   } 
   public E remove(int index) {
	   if( size == 0)
		     return null;
	   else if(index <0 || index >size) 
		     return null;
	   else {
		   E temp = arr[index]; 
		   for(int i=index;i<size;i++)
			   arr[i] = arr[i+1];
		   size--;
		   return temp;
	   }	    
   } 
   public void clear() {
	   size =0;
   }
}
