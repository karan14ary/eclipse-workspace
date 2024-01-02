package CountCharacterEachWord;

import java.util.Scanner;


public class CountCharacterApp {

	public static void main(String[] args) {
		// creating object of Scanner class
				Scanner scan=new Scanner(System.in);
				//asking for user input
				System.out.println("Enter a sentence");
				//storing a sentence in a s variable 
				String s=scan.nextLine();
				//invoking countWord()
				//CountCharacter.countCharacterEachWord(s);
				CountCharacterWithoutInbuild.countCharacter(s);
	}

}
