package Selection;

import java.util.Scanner;

public class CheckCharacterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
System.out.println("Enter the character");
char ch= scan.next().charAt(0);
CheckCharacter.character(ch);
	}

}
