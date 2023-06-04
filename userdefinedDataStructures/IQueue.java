package com.userdefinedDataStructures;
public interface IQueue<T>{ 
	boolean isEmpty();
	int size();
	void enqueue(T  ele);
	T dequeue();
	T peek();
}
