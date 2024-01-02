package MergeArray;

public class MergeArray {
static void mergeApp(int o,int []arr1,int []arr2) {
int []arr3= new int[o];
for (int i=0;i<=arr1.length-1;i++) {
		arr3[i]=arr1[i];
	}
for (int i=0;i<=arr2.length-1;i++) {
	arr3[i+arr1.length]=arr2[i];
}
for(int i=0;i<=arr3.length-1;i++) {
	System.out.println(arr3[i]);
}
}
}


