package com.BuiltinDataStructures;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> cart = new TreeMap<>();
		cart.put("book",5);
		cart.put("pen",2);
		cart.put("notebook",10);
		cart.forEach((key,value)->System.out.println("key = "+key +" "+ "value= "+ value));
		System.out.println(cart.put("pen",3));
		cart.forEach((key,value)->System.out.println("key= "+key+" "+"value = "+ value));
		String line = "All is well All is well All ";
		Map<String,Integer> wordfreq = new HashMap<>();
		String[] words = line.split(" ");
		for(String word : words) {
			if(wordfreq.containsKey(word)) {
				int currfreq = wordfreq.get(word)+1;
				wordfreq.put(word,currfreq);
			} 
			else wordfreq.put(word,1);
		} 
		wordfreq.forEach((key,value)->System.out.println("key = "+key+" "+"value = "+value));
		System.out.println(wordfreq.keySet());
		System.out.println(wordfreq.values());
		
	}
}
