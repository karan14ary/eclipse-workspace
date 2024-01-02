package SemesterMarksAverage;

import java.util.Scanner;

public class SemesterAverageMarksApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter sem1 marks");
		int sem1=scan.nextInt();
		System.out.println("Enter sem2 marks");
		int sem2=scan.nextInt();
		System.out.println("Enter sem3 marks");
		int sem3=scan.nextInt();
		System.out.println("Enter sem4 marks");
		int sem4=scan.nextInt();
		System.out.println("Enter sem5 marks");
		int sem5=scan.nextInt();
		System.out.println("Enter sem6 marks");
		int sem6=scan.nextInt();
		System.out.println("Enter sem7 marks");
		int sem7=scan.nextInt();
		System.out.println("Enter sem8 marks");
		int sem8=scan.nextInt();
		System.out.println(SemesterAverageMarks.calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8));
	}

}
