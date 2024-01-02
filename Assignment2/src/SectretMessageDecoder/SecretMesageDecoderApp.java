package SectretMessageDecoder;

import java.util.Scanner;

public class SecretMesageDecoderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("Enter the Character");
char ch= scan.next().charAt(0);
MessageDecoder decoder = new MessageDecoder();
System.out.println(decoder.decodeCharacter(ch));

	}

}
