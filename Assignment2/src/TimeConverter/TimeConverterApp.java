package TimeConverter;

import java.util.Scanner;

public class TimeConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the minute");
int min=scan.nextInt();
System.out.println(TimeConverter.convertToHours(min));
	}

}
