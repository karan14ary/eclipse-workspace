package VendingMachine;

public class VendingMachine {
static void vendingMachine(String s) {
	switch(s) {//check the product code and give the productr acccording to the code 
	case "p1" :{
		System.out.println("Chocolate");
	break;
	}
	case "p2" :{
		System.out.println("Biscuit");
	break;
	}
	case "p3" :{
		System.out.println("Cold drink");
	break;
	}
	case "p4" :{
		System.out.println("Bread");
	break;
	}
	case "p5" :{
		System.out.println("Cake");
	break;
	}
	default :{
		System.out.println("Invalid input");
	}
	}
}
}
