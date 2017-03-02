package shape;

public class Triangle implements Shape {

	final double sideA, sideB, sideC;
	
	public Triangle(){
		this(1,1,1);
	}
	
	public Triangle(double sideA, double sideB, double sideC){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	@Override
	public double getArea() {
		// area = SquareRoot(p * (p-a) * (p-b) * (p-c)
		// p = 0.5 * perimeter
		double p = 0.5 * this.getPerimeter();
		return Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));
	}

	@Override
	public double getPerimeter() {
		// perimeter = a + b + c
		return sideA + sideB + sideC;
	}

}
