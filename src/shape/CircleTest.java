package shape;

import static org.junit.Assert.*;
import org.junit.Test;
import static java.lang.Math.PI;

public class CircleTest {
	
	private static final double DELTA = 1e-15;
	
	@Test
	public void testCircle() {
		Circle c = new Circle();
		assertTrue("radius must be > 0", c.radius > 0);
	}

	@Test
	public void testCircleDouble() {
		Circle c = new Circle(1);
		assertEquals(c.radius, 1, DELTA);
	}

	@Test
	public void testGetArea() {
		Circle c = new Circle(1);
		assertEquals(c.getArea(), PI, DELTA);
	}

	@Test
	public void testGetPerimeter() {
		Circle c = new Circle();
		assertEquals(c.getPerimeter(), 2*PI, DELTA);
	}

}
