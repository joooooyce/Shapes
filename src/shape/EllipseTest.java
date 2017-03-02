package shape;

import static org.junit.Assert.*;
import static java.lang.Math.PI;

import org.junit.Test;

public class EllipseTest {

	private static final double DELTA = 1e-15;
	
	@Test
	public void testEllipse() {
		Ellipse e = new Ellipse();
		assertTrue("majorRadius must be > 0", e.majorRadius > 0);
		assertTrue("minorRadius must be > 0", e.minorRadius > 0);
	}

	@Test
	public void testEllipseDoubleDouble() {
		Ellipse e = new Ellipse(1,1);
		assertEquals(e.majorRadius, 1, DELTA);
		assertEquals(e.minorRadius, 1, DELTA);
	}

	@Test
	public void testGetArea() {
		Ellipse e = new Ellipse(1, 1);
		assertEquals(e.getArea(), PI, DELTA);
	}

	@Test
	public void testGetPerimeter() {
		Ellipse e = new Ellipse(1, 1);
		assertEquals(e.getPerimeter(), 2*PI, DELTA);
	}

}
