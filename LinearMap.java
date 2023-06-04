package com.datastructures.userdefined;

import java.util.*;

public class LinearMap <K,V>{
		class Entry{
			private K key;
			private V value;
			Entry(){};
			Entry(K key,V value){
				this.key = key;
				this.value = value;
			} 
			public String toString() {
				return "key = "+key +", value =" +value;
			}
			
		}
		private class Node{
			Entry data;
			Node next;
			Node(Entry data,Node next){
				this.data = data;
				this.next = next;	
			}
			@Override
			public String toString() {
				return data.toString();
			}
		} 
		private Node head;
		public V put(K key,V value) {
			if(head == null) {       // when first node itself is null
				head = new Node(new Entry(key,value),null);
				return null;
			}else {
				Node temp = head;
				Node pTemp = null;
				while(temp!=null) {
					if(key.equals(temp.data.key)) {
						V tempvalue = temp.data.value;
						temp.data.value = value;
						return tempvalue;
					}
					pTemp = temp;
					temp = temp.next;
				} 
				pTemp.next = new Node(new Entry(key,value),null);
				return null;
			} 
		} 
		V get(K key) {
			Node temp = head;
			while(temp!=null) {
				if(key.equals(temp.data.key)) 
					return temp.data.value;
				temp = temp.next;
			}
			return null;
		}  
		V remove(K key) {
			Node temp = head,pTemp = null;
			V tvalue = null;
			if(key.equals(head.data.key)) {
				tvalue = head.data.value;
				head = head.next;
			}else {
				while(temp!=null) {
					if(key.equals(temp.data.key)) {
						pTemp.next = temp.next;
						tvalue = temp.data.value;
					}
					pTemp = temp;
					temp = temp.next;
				}
			}
			return tvalue;		
		} 
		Set<Entry> entrySet(){
			LinkedHashSet<Entry>  entries = new LinkedHashSet<>();
			Node temp = head;
			while(temp!=null) {
				entries.add(temp.data);
				temp = temp.next;
			}
			return entries;
		}
		void display() {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp);
			 temp = temp.next;
			}
		} 
		Set<K> keyset(){
			LinkedHashSet<K> lhs = new LinkedHashSet<>();
			Node temp = head;
			while(temp!=null) {
				lhs.add(temp.data.key);
				temp = temp.next;
			}
			return lhs;
	} 
	Collection<V> values(){ // It may contain duplicates that's why we used collection here
		List<V> list =  new ArrayList<>();
		Node temp = head;
		while(temp!=null) {
			list.add(temp.data.value);
			temp = temp.next;
		}
		return list;
	} 
	boolean ContainsKey(K key) {
		Node temp = head;
		while(temp!=null) {
			if(key.equals(temp.data.key))
				return true;
		    temp = temp.next;
		}
		return false;
	}
	boolean ContainsValue(V value) {
		Node temp = head;
		while(temp!=null) {
			if(value.equals(temp.data.value))
				return true;
		    temp = temp.next;
		}
		return false;
	}
		
}
