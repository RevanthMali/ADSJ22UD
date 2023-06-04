package com.BuiltinDataStructures; 

public class Contact implements Comparable<Contact> {
    private String name;
    private long number;
    Contact(String name,long number){
    	this.name = name;
    	this.number = number;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
    public String toString(){
    	return name+ " " +number;
    } 
	public int compareTo(Contact other ) {
		return name.compareTo(other.name);
	}
}
