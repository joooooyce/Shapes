package shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape {

	final double radius;
	
	public Circle(){
		this(1);
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		//area = pi * r^2
		return PI * pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		// perimeter = 2 * pi * r
		return 2 * PI * radius;
	}

}
