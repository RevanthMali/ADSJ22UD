package com.userdefinedDataStructures;
public class UStack<E> {
    private int top =-1;
    private E[] arr; 
    private int size;
	public UStack(){
	arr =(E[]) new Object[10];
	} 
	public UStack(E arr) {
		this.arr = (E[]) arr; 
		//size = arr.length;
		top = size -1;		
	} 
	public int size() {
		return size;
	}  
	public boolean push(Object ele) {
		 E key = (E) ele; 
		 if(top == arr.length-1) {
			 return false;
		 } 
		 else {
			 arr[++top] = key;
			 size ++;
			 return true;
		 }	 
	} 
	public E pop() {
		if(top == -1)
			  return null;
		else {
			E element = arr[top];
			arr[top--] = null;
			size --;
			return element;
		}
	}
	public void display() {
		System.out.println("The elements of the stack are: "); 
		for(int i = top; i>=0;i-- ) {
			System.out.println(arr[i]+" ");
		}
	} 
	public E peek() {
		return top>=0? arr[top] : null;
	}
}
