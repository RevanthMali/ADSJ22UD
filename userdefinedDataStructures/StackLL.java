package com.userdefinedDataStructures;

public class StackLL<T> implements IStack<T> {
        private class Node{
        	T data;
        	Node next;
        	Node(T data,Node next){
        		this.data = data;
        		this.next = next;
        	 } 
        	public String toString() {      		
        			return data.toString();
        		}
        }
        private Node top;
		public boolean isEmpty() {
			return  null == top;
		}
		public int size() {
			Node temp = top;
			int count=0;
			while(temp!=null) {
				count++;
				temp = temp.next;
			} 
			return count;
		}		
		public void push(T ele) {
				top = new Node(ele,top);//create a new node and assign it to the top...	
		}
		public T pop() {
			if(top == null) 
				return null;
			T ele = top.data; //let the variable point to top 
			top = top.next; //top points to next element 
			return ele; //return the deleted element...
		}

		public T peek() {
			return top.data;
		}
		public void display() {
			Node temp = top; 
			System.out.println("The elements of the stack are: ");
			while(temp!=null) {
				System.out.print(temp + " ->");
				temp = temp.next;
			}
			System.out.println("null");
			
		} 
}
