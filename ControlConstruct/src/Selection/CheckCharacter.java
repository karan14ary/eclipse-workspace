package Selection;

public class CheckCharacter {
static void character(char ch) {
	if(ch>='a'&&ch<='z') {
		System.out.println("LowerCase");
	}
	else if(ch>='A'&&ch<='Z') {
		System.out.println("UpperCase");
	}
	else if(ch>='0'&&ch<='9') {
		System.out.println("Number");
	}
	else {
		System.out.println("Special Character");
	}
}
}
