package com.Inheritance.UserConst;

import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      if(n==1) {
    	  
    	  Friend f=new Friend(scan.next(),scan.nextInt());
    	  System.out.println("Friend Information:");
    	  f.displayInfo();
    	  f.manageFrend();
      }
      else if(n==2) {
    	 
      Follower fl=new Follower(scan.next(),scan.nextInt());
      System.out.println("Follower Information:");
      fl.displayInfo();
      fl.manageFollower();
	}
      }

}
