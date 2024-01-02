package FrequencyOfDigit;

public class Frequency {
static void frequency(int n,int arr[]) {
	int temp=0;//initialize temp
	while(n!=0) {//check until n is greater than 0
		temp=n%10;//get ramainder
		arr[temp]++;//increse temp of array count
		n=n/10;//get quotient
	}
for(int i=0;i<arr.length;i++) {//loop for array
		int f=0;//initializing frequency
		f=arr[i];//assign array to frequency
		if(f!=0) {//check for non zero value in array
			System.out.println(i +" "+f);
		}
	}
}
}
