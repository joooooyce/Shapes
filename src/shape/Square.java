package shape;

public class Square implements Shape{
	
	final double length;
	
	public Square(){
		this(1);
	}
	
	public Square(double length){
		this.length = length;
	}

	@Override
	public double getArea() {
		// area = length * length
		return length * length;
	}

	@Override
	public double getPerimeter() {
		// perimeter = length * 4
		return length * 4;
	}

}
