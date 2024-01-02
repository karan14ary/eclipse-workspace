package com.Professor;

public class Professor {
	static String univName="vtu";
	static int totalProf=0;
	static {
		System.out.println("Welcome to "+univName);
	}
	static int getTotalProf() {
		return totalProf;
	}
	int profId;
	String subject;
	{
		totalProf+=1;
		profId=totalProf;
		System.out.println("Hiring new Professor");
		
	}
	void teach() {
		System.out.println("Professor Id:"+profId+" is teaching "+subject);
		
	}
	public Professor(String subject) {
		this.subject=subject;
		
	}
	public static void main(String[] args) {
	System.out.println("Total professor at start:"+Professor.getTotalProf());
Professor prof1=new Professor("Java");
prof1.teach();
Professor prof2=new Professor("SQL");
prof2.teach();
	System.out.println("Total Professor now:"+getTotalProf());
	}
}
