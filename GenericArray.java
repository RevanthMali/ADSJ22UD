package generics;

import java.util.Arrays;

public class GenericArray<T> {
    T[] arr; 
    public GenericArray(int size) {
    	 arr = (T[]) new Object[size];
    }
    public GenericArray(T[] arr) {
    	this.arr=arr;
    } 
    public void insert(int index,T ele) {
    	arr[index] =ele;
    } 
    public void sort() {
    	Arrays.sort(arr); 
    	System.out.println(this);
    } 
    @Override
    public String toString() {
    	return Arrays.toString(arr);
    }
}
