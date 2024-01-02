package Poly;

public class ShapeApp {

	public static void main(String[] args) {
		Calculate c=new Calculate();
		Rectangle r=new Rectangle();
		Square sq=new Square();
		Circle ci=new Circle();
//		c.calculateRectangle(r);
//		c.calculateSquare(sq);
//		c.calculateCircle(ci);
		c.calculate(r);
		c.calculate(sq);
		c.calculate(ci); 
	}

}
