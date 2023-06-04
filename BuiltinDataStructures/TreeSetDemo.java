package com.BuiltinDataStructures;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		Comparator<Contact > c1 = new Comparator<Contact>() {
			public int compare(Contact c1, Contact c2) {
				return c2.getName().compareTo(c1.getName());
			}
			};
		//creating an anonymous class
		TreeSet<Contact> contacts = new TreeSet<>(c1);
		contacts.add(new Contact("name2", 888889991));
		contacts.add(new Contact("name1", 888889992));
		contacts.add(new Contact("name3", 888889990));
		contacts.forEach(System.out::println);
	}
}
