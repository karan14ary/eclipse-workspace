package com.Assignment.ReplaceNegativeElement;

public class ReplaceNegativeElement {
static void replaceNegativeElement(int []arr) {
	//displaying elements in an array
			System.out.println("The elements in an array is : ");
			for(int x:arr) {//take each element of an array
				if(x>0) {//check element whether positive or negative or zero
				System.out.print(x+" ");//if positive then print element
			}
				else {//assign element with zero  
					x=0;
					System.out.print(x+" ");//print zero
				}
}
}
}
