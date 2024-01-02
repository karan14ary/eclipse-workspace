package CharacterIdentification;

import java.util.Scanner;

public class CharacterIdentificationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a character");//Ask for user input
		char ch=scan.next().charAt(0);//store the user input in a  variable 
		CharacterIdentification.characterIdentification(ch);//invoking method
	}

}
