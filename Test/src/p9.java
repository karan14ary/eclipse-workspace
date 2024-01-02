import java.util.Arrays;
import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(borderMax(arr));
	}
	public static int borderMax(int arr[]) {
		Arrays.sort(arr);
	int	greater=arr[arr.length-1];
		return greater;
	}
}
