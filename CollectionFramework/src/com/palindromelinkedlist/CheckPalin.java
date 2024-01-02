package com.palindromelinkedlist;
import java.util.*;
public class CheckPalin {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
LinkedList <Integer>ll=new LinkedList<>();
		while (true) {
		String input=scan.nextLine();
		if(input.isEmpty()) {
			break;
		}
		ll.add(Integer.parseInt(input));
		}
		LinkedList<Integer>reverse=new LinkedList<Integer>(ll);
		Collections.reverse(reverse);
		if(ll.equals(reverse)) {
			System.out.println("Is palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
	

}
