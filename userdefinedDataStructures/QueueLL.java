package com.userdefinedDataStructures;

public class QueueLL<T> implements IQueue<T> {

	private class Node{
		T data;
		Node next; 
		Node(T data){
			this.data = data;
			this.next = null;
		 }
	} 
	private Node front,rear;	
	public boolean isEmpty() {
		return (front == null && rear ==null) ;
	}
	public int size() {
		int count = 0;
		Node temp = front; //assign the front to the variable temp
		while(temp!= null) {
			count ++;
			temp = temp.next;
		} 
		return count;
	}
	public void enqueue(T ele) {
		if(isEmpty()) 
			front = rear = new Node(ele);
		else {
			Node nn = new Node(ele); 
			rear.next = nn;
			rear = rear.next;
		}
	}
	public T dequeue() {
		if(isEmpty()) 
			  return null;
		T ele = front.data;
		front = front.next;
		if(front ==null) rear = null;  //no elements in the queue
		return ele;
	}	
	public T peek() {
		return front.data; //return the first element in the queue....
	} 
	public void Display() {
		Node temp = front;
		while(temp!=null) {
			System.out.print(temp.data +"->"); 
			temp= temp.next;
		}  
		System.out.println("null");
	}
}
