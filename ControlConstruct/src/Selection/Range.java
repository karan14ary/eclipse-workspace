package Selection;

public class Range {
static void range(int num) {
	if(num>=1&& num<=10) {
		System.out.println("Range 1");
	}
	else if(num>=11&& num<=20) {
		System.out.println("Range 2");
	}
	else if(num>=21&& num<=30) {
		System.out.println("Range 3");
	}
	else if(num>=31&& num<=40) {
		System.out.println("Range 4");
	}
	else if(num>=41&& num<=50) {
		System.out.println("Range 5");
	}
	else {
		System.out.println("Outside of range");
	}
}
}
