package ElevatorProblem;

import java.util.Scanner;

public class ElevatorProblemApp {

	public static void main(String[] args) {
		//Creating array
				int[] arr=new int[10];
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the Weight of Each Passenger");
		        //for loop for adding marks in an array
				for(int i=0;i<=arr.length-1;i++)
				{
					arr[i]=scan.nextInt();
				}
				//Displaying whether the lift will work or not
				int sum=0;
				for(int i=0;i<=arr.length-1;i++) {
				sum=sum+arr[i];	
				}
				System.out.println("The total weight on a lift is"+sum);
				if(sum>800) {
					System.out.println("The elevator will not work");
				}
				else {
					System.out.println("The elevetor will work");
				}
				

	}

}
