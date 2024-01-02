package CopyAllElementOFArra;

public class CopyArray {
	static void copyArray(int[] arr1)
	{
	int []arr2=new int[arr1.length];
System.out.println("Element of Array 2 is :");
		for (int i=0;i<=arr1.length-1;i++) {
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
		}
		
	}

}
