package com.RecursionMultipleOfNumber;

public class Multiple {

	public static void findTableOfN(int n, int m) {
		if(m==11) {//check if m=11 then
			return;
		}
		else {
			System.out.println(n+" x "+m+" = "+(n*m));
			//print table of a number 
			findTableOfN( n, m+1);//invoke a method findTableOfN(n,m+1)
			//increasing m by 1 each time the method is called
		}
		
	}

}
