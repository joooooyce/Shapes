package shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	private static final double DELTA = 1e-15;
	
	@Test
	public void testSquare() {
		Square s = new Square();
		assertTrue("Length must be > 0", s.length > 0);
	}

	@Test
	public void testSquareDouble() {
		Square s = new Square(5);
		assertEquals(s.length, 5, DELTA);
	}

	@Test
	public void testGetArea() {
		Square s = new Square(5);
		assertEquals(s.getArea(), 25, DELTA);
	}

	@Test
	public void testGetPerimeter() {
		Square s = new Square(5);
		assertEquals(s.getPerimeter(), 20, DELTA);
	}

}
