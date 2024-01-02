package com.customException;

import java.util.Scanner;

public class DrivingLisenceApp {

	public static void main(String[] args) {
	try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=scan.nextInt();
		applyDrivingLisence(age);
	}
//	catch(OverAgeException oae) {
//		System.out.println("Exception is handled for Over Age");
//		oae.printStackTrace();
//	}
//	catch(UnderAgeException uae) {
//		System.out.println("Exception is handled for Under Age");
//		uae.printStackTrace();
//	}
	catch(Exception e) {
		System.out.println("Exception Handled");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
	static void applyDrivingLisence(int age) throws Exception//throws OverAgeException
	 ,UnderAgeException
	{
		if(age>=18&&age<=65) {
			System.out.println("Congratulation! You can apply for thr driving lisence");
		}
		else if(age<18) {
			//throw new UnderAgeException();
			UnderAgeException uae=new UnderAgeException();
			throw uae;
			
		}
		else {
			//throw new OverAgeException();
			OverAgeException oae=new OverAgeException();
			throw oae;
			
		}
	}
}
