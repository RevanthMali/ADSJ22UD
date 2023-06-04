package com.userdefinedDataStructures;

public class UQueue <E>{
	    private E[] arr; 
	    private int size;
		public UQueue(){
		arr =(E[]) new Object[10];
		} 
		public UQueue(E arr) {
			this.arr = (E[]) arr; 
		} 
		public int size() {
			return rear+1;
		}  
		private int front = 0,rear = -1;
		public boolean enqueue(Object ele) {
			 E key = (E) ele; 
			 if(front == 0 &&  rear == -1) { // if no element is present in the queue 
				   arr[++rear] =arr[front] = key; 
				   return true;
			 } 
			 else if(front <= rear ){ // if some elements are present
				 arr[++rear] = key;
				 size ++; 
				  return true;
			 } 
			 return false;
		} 
		public E  dequeue() {
			if(front  == 0 && rear ==-1) //queue is empty
				  return null;
			if(front <= rear ){  //remove the element from  the front 
				E element = arr[front];
				arr[front++] = null;
				size --;
				return element;
			}
			return null;
			
		}
		public void display() {
			System.out.println("The elements of the Queue are: ");  
		   for(int i= front;i<= rear;i++) {
				System.out.print(arr[i]+" "); 
			}     	 
		   System.out.println();
	   }
	
		public E peek() {
			return arr[front];
		}
}
