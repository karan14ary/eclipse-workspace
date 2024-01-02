import java.util.Arrays;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
       String s=scan.next();
       int k=scan.nextInt();
       lex(s,k);
	}
	static void lex(String s,int k) {
		char[]arr=s.toCharArray();
		String str1="";
		for(int i=0;i<=arr.length-k;i++) {
			//create an empty String
			String str="";
			
			//traverse element from i to arr.length-1
			for(int j=i;j<=i+k-1;j++) {
				str=str+arr[j];//concater the string with a char arr[]
			}
			str1+=str+",";	
			
		}
		System.out.println(str1);
		String[]newstr=str1.split(",");
		Arrays.sort(newstr);
		for(String x:newstr) {
			System.out.print(x+",");	
		}
	}
}

