package CountCharacterEachWord;

public class CountCharacter {
static void countCharacterEachWord(String s) {
	String []arr=s.split(" ");//creaing string array of words
	for(int i=0;i<=arr.length-1;i++) {//traverse all words
		System.out.println("Characters in \""+arr[i]+"\" is : "+arr[i].length());
		//print including the double quotes
	}
}
}
