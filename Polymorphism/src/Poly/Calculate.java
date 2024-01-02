package Poly;

public class Calculate {
//static void calculateRectangle(Shape s) {
//	s.draw();
//	System.out.println("Area of Rectangle "+s.calculateArea());
//	System.out.println("Perimeter of Rectangle "+((Rectangle)(s)).calculatePerimeter());
//}
//static void calculateSquare(Shape s) {
//	s.draw();
//	System.out.println("Area of Square "+s.calculateArea());
//	System.out.println("Perimeter of Square "+((Square)(s)).calculatePerimeter());
//	
//}
//static void calculateCircle(Shape s) {
//	s.draw();
//	System.out.println("Area Of Circle "+s.calculateArea());
//	System.out.println("Perimeter of Circle "+((Circle)(s)).calculatePerimeter());
//}
	static void calculate(Shape s) {
	s.draw();
	System.out.println("Area "+s.calculateArea());
	if(s instanceof Rectangle) {
	System.out.println("Perimeter of Rectangle "+((Rectangle)(s)).calculatePerimeter());
}
	else if(s instanceof Square) {
		System.out.println("Perimeter of Square "+((Square)(s)).calculatePerimeter());
	}
	else if(s instanceof Circle) {
		System.out.println("Perimeter of Circle "+((Circle)(s)).calculatePerimeter());
	}
	}
}
