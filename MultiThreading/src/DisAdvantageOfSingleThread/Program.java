package DisAdvantageOfSingleThread;

public class Program {

	public static void main(String[] args) {
		printNum();
		printChar();

	}
	static void printNum() {
	try {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
	}	
	catch(InterruptedException ie) {
		ie.printStackTrace();
	}
	}
	static void printChar() {
		try{
			for(char i='a';i<='e';i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
