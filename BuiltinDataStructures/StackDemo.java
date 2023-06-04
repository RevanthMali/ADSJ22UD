package com.BuiltinDataStructures;
import java.util.*;
public class StackDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<>();
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		char ch = 0;
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			stk.push(ch);
		} 
		System.out.println("The reverse of the string is : ");
		while(!stk.isEmpty()) {
			System.out.print(stk.pop());
		}
	}

}
