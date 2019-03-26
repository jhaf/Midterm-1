package pkgTestShape;

import static org.junit.Assert.assertTrue;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {
	
	@Test
	public void RectangleGetTest() {
		Rectangle rec = new Rectangle(1, 2);
		assertTrue(rec.getiLength() == 1);
		assertTrue(rec.getiWidth() == 2);
		
	}
	@Test
	public void RectangleSetTest1() {
		Rectangle rec = new Rectangle(1, 2);
		rec.setiLength(2);
		rec.setiWidth(1);
		assertTrue(rec.getiLength() == 2);
		assertTrue(rec.getiWidth() == 1);
	
	}
	@Test (expected = IllegalArgumentException.class)
	public void RectangleSetTest2() {
		Rectangle rec = new Rectangle(1, 2);
		rec.setiLength(0);
		assertTrue(rec.getiLength() <= 0);
	
	}
	@Test (expected = IllegalArgumentException.class)
	public void RectangleSetTest3() {
		Rectangle rec = new Rectangle(1, 2);
		rec.setiWidth(0);
		assertTrue(rec.getiWidth() <= 0);
	
	}
	@Test
	public void RectangleAreaTest1() {
		Rectangle rec = new Rectangle(1, 2);
		assertTrue(rec.area() == 2);
	
	}
	@Test
	public void RectangleAreaTest2() {
		Rectangle rec = new Rectangle(4, 4);
		assertTrue(rec.area() == 16);
	
	}
	@Test
	public void RectanglePerimeterTest1() {
		Rectangle rec = new Rectangle(1, 2);
		assertTrue(rec.perimeter() == 6);
	
	}
	@Test
	public void RectanglePerimeterTest2() {
		Rectangle rec = new Rectangle(4, 4);
		assertTrue(rec.perimeter() == 16);
	
	}
}