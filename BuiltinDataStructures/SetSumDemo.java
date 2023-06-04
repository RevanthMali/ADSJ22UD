 
package com.BuiltinDataStructures;

import java.util.*;

public class SetSumDemo<E> {
	public static void main(String[] args) {
	    HashSet<Integer> setA = new HashSet<>();
		setA.add(10);
		setA.add(20);
		setA.add(30);
		setA.add(40);
		System.out.println("The elements of the set are : ");
		setA.forEach(ele-> System.out.println(ele +" "));  
		System.out.println("Sum of the elements of the set are : "+ sum(setA));
		System.out.println("Minimum  element of the setA : "+ minimum(setA));
		//using streams
		Optional<Integer> min = setA.stream().reduce((a,b)-> a<b ?a :b);
		System.out.println(min.get());
		Optional<Integer> max = setA.stream().reduce((a,b)-> a>b ?a :b);
		System.out.println(max.get());
	}
    private static int sum(HashSet<Integer> setA) {
    	  int sum =  0;
    	  for(int ele : setA) 
    		  sum += ele;
    	  return sum;
    } 
    private static int minimum(HashSet<Integer> setA) {
    	  int min = Integer.MAX_VALUE;
    	  Iterator<Integer> it = setA.iterator();
    	  while(it.hasNext()) {
    		  int currEle = it.next();
    		  if(currEle < min)
    			  	min = currEle;
    }
   return min;
}
}