package com.datastructures.userdefined;
import java.util.*;
public class SeperateChaining<K,V> {
	private  Node<K,V>[] table;
		private int size;
		private int n;
		private class Node<K,V>{
			private K key;
			private V value;
			private Node next;
			private Node() {}
			private Node(K key,V value,Node next) {
				this.key=key;
				this.value = value;
				this.next=next;
			} 		
	} 
		public SeperateChaining(int capacity) {
			table = new Node[capacity];
			size = capacity;
		} 
		public int size() {
			return size;
		} 
		public boolean isEmpty() {
			return n ==0;
		} 
		public V get(K key) {
			int h;
			int k = (Integer) key;
			h = k % size;
			Node t = table[h];
			while(t!=null) {
				if(t.key.equals(key)) {
					V val = (V) t.value;
				    return val;
				}
				t = t.next;
	    	} 
			return null;	
		} 
		public boolean contains(K key) {
			int h;
			int k = (Integer) key;
			h = k% size;
			Node t = table[h];
			while(t!=null) {
				if(t.key.equals(key)) {
					return true;
				}
				t = t.next;
			}
			return false;
		} 
		public void put(K key, V value) {
			int h;
			int k= (Integer) key;
			h = k% size;
			// create a new node
			Node<K,V> nn = new Node<>(key,value,null);
			if(table[h]==null) // home bucket is empty
				table[h] = nn;
			else { // home bucket not empty
				Node<K,V> t = table[h]; // starting from the head in that home bucket
				while(t.next!=null) // traverse till last node
					t = t.next;
				    t.next = nn;
			}
			n++;
		} 
		public V remove(K key) { 
			if(contains(key)) {
				System.out.println("Data deleted successfully  from the hash table");
				int h;
				int k = (Integer)key;
				h = k% size;
				if(table[h].key.equals(key)) {
					V val = table[h].value;
					table[h] = table[h].next;
					n--;
					return val;
				}
				Node<K,V> t = table[h], p = null;
				while(t!=null) {
					if(t.key.equals(key)) {
						V val = t.value;
						p.next = t.next;
						n--;
						return val;
					}
					p = t;
					t= t.next;
				}
			}
			System.out.println("Given data is not present in the hash table");
			return null;
		} 
		public void display() {
			for(int i=0;i<size;i++) {
				Node t = table[i];
				if(t!=null) {
					System.out.println("Data at the index"+i +" in hash table :" );
					System.out.println("ID, Value");
					System.out.println("------------------------------------");
					while(t!=null) {
						System.out.println(t.key +" "+t.value);
						t= t.next;
					}
				}
			}
		}		
}
