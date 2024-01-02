package Selection;

public class NameCity {
static void nameCity(String name) {
	switch(name) {
	case "Ajay":{
		System.out.println(name+" Delhi");
		break;
	}
	case "Arjun":{
		System.out.println(name+" Pune");
		break;
	}
	case "Ankit":{
		System.out.println(name+" Banglore");
		break;
	}
	case "Akash":{
		System.out.println(name+" Hydrabad");
		break;
	}
	default :System.out.println(name +" India");
	}
}
}
