import java.util.Scanner;

public class Append {
static String addCharacter(String s,char ch,int j) {
	String newstr="";
	if(j<0||j>=s.length()-1) {
	return s;
	}
	else {
		for(int i=0;i<=s.length()-1;i++) {
			if(i==j) {
				newstr+=s.charAt(i)+ch+"";
			}
			else {
				newstr+=s.charAt(i);
			}
		}
	}
	return newstr;
}
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	int j=scan.nextInt();
	char ch=scan.next().charAt(0);
	String s=scan.next();
	System.out.println(addCharacter(s,ch,j));
}
}
