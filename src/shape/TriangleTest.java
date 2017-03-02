package shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	private static final double DELTA = 1e-15;
	
	@Test
	public void testTriangle() {
		Triangle t = new Triangle();
		assertTrue("Side A must be > 0", t.sideA > 0);
		assertTrue("Side B must be > 0", t.sideB > 0);
		assertTrue("Side C must be > 0", t.sideC > 0);
	}

	@Test
	public void testTriangleDoubleDoubleDouble() {
		Triangle t = new Triangle(3,4,5);
		assertEquals(t.sideA, 3, DELTA);
		assertEquals(t.sideB, 4, DELTA);
		assertEquals(t.sideC, 5, DELTA);
	}

	@Test
	public void testGetArea() {
		Triangle t = new Triangle(3,4,5);
		assertEquals(t.getArea(), 6, DELTA);
	}

	@Test
	public void testGetPerimeter() {
		Triangle t = new Triangle(3,4,5);
		assertEquals(t.getPerimeter(), 12, DELTA);
	}

}
