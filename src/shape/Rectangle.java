package shape;

public class Rectangle implements Shape {
	
	final double height; //sides
	final double width;
	
	public Rectangle(){
		this(1, 1);
	}
	
	public Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		// area = height * width;
		return height * width;
	}

	@Override
	public double getPerimeter() {
		// perimeter = 2*height + 2*width
		return 2 * (height + width);
	}

}
