package shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	private static final double DELTA = 1e-15;
	
	@Test
	public void testRectangle() {
		Rectangle r = new Rectangle();
		assertTrue("Height must be > 0", r.height > 0);
		assertTrue("Width must be > 0", r.width > 0);
	}

	@Test
	public void testRectangleDoubleDouble() {
		Rectangle r = new Rectangle(4, 2);
		assertEquals(r.height, 4, DELTA);
		assertEquals(r.width, 2, DELTA);
	}

	@Test
	public void testGetArea() {
		Rectangle r = new Rectangle(4,2);
		assertEquals(r.getArea(),8, DELTA);
	}

	@Test
	public void testGetPerimeter() {
		Rectangle r = new Rectangle(4,2);
		assertEquals(r.getPerimeter(), 12, DELTA);
	}

}
