package AgeGroup;

public class AgeGroup {
static void ageGroup(int age) {
	if(age>=0&&age<=12) {// check age from 0 to 12
		System.out.println("Child");
	}
	else if(age>=13&&age<=19) {// check age from 13 to 19
		System.out.println("Teen");
	}
	else if(age>=20&&age<=59) {// check age from 20 to 59
		System.out.println("Adult");
	}
	else if(age>=60) {// check age greater than equal to 60
		System.out.println("Senior");
	}
	else {
		System.out.println("Invalid Input");
	}
}
}
