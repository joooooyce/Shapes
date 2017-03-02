package shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ellipse implements Shape {

	final double majorRadius, minorRadius;
	
	public Ellipse(){
		this(1,1);
	}
	
	public Ellipse(double majorRadius, double minorRadius){
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}
	
	@Override
	public double getArea() {
		// area = pi * majorRadius * minorRadius
		return PI * majorRadius * minorRadius;
	}

	@Override
	public double getPerimeter() {
		// approximation of perimeter
		// p = 2pi * sqrt(0.5* (majorRadius^2)+(minorRadius^2))
		return 2 * PI * sqrt(0.5 * (pow(majorRadius, 2) + pow(minorRadius, 2)));
	}

}
