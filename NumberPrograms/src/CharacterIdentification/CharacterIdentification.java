package CharacterIdentification;

public class CharacterIdentification {
	
static void characterIdentification(char ch) {
	if(ch>='a'&&ch<='z') {//check lowercase a to z
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')//check vowels 
		{
			System.out.println("LowerCase  Vowel");
		}
		else {
			System.out.println("LowerCase Consonant");
		}
		}
	else if(ch>='A'&&ch<='Z') {//check uppercase A to Z
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')//Check vowel letters 
			{
				System.out.println("UpperCase  Vowel");
			}
			else {
				System.out.println("UpperCase Consonant");
			}
		}
	else if(ch>='0'&&ch<='9') {//check number 0 to 9
		System.out.println("Digit");
	}
	else {
		System.out.println("Special Character");
	}
	}
}

