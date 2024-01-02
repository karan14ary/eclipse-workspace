package poly;

public class Circle  extends Shape {
public void draw() {
	System.out.println("Drawing circle shape");
}
double calculateArea()
{
return Math.PI*5.5*5.5;	
}
double calculatePerimeter() {
	return Math.PI*2*5.5;
}
}
