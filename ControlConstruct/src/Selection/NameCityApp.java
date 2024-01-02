package Selection;

import java.util.Scanner;

public class NameCityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scan.next();
		NameCity.nameCity(name);
	}

}
