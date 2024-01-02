package poly;

public class App {

	public static void main(String[] args) {
		Shape s=new Circle();
		s.draw();
	System.out.println(s.calculateArea());	
	System.out.println(((Circle)(s)).calculatePerimeter());
		

	}

}
