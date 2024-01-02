package SumArray;

public class SumArray {
static void sumApp(int n,int []arr1,int []arr2) {
	int []arr3=new int[n];
	for(int i=0;i<=arr3.length-1;i++) {
		arr3[i]=arr1[i]+arr2[i];
	System.out.println(arr3[i]);
	}
}
}
