package com.userdefinedDataStructures;

public interface IStack <T>{
	boolean isEmpty();
	int size();
	void push(T  ele);
	T pop();
	T peek();
}
