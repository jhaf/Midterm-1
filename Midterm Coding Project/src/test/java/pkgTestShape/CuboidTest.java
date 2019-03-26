package pkgTestShape;

import static org.junit.Assert.assertTrue;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;

import pkgShape.Cuboid;

public class CuboidTest {
	
	@Test
	public void CuboidGetTest1() {
		Cuboid cube = new Cuboid(1, 2, 3);
		assertTrue(cube.getiLength() == 1);
		assertTrue(cube.getiWidth() == 2);
		assertTrue(cube.getiDepth() == 3);
	}
	@Test
	
	public void CuboidGetTest2() {
		Cuboid cube = new Cuboid(1, 2, 3);
		cube.setiLength(4);
		cube.setiWidth(5);
		cube.setiDepth(6);
		assertTrue(cube.getiLength() == 4);
		assertTrue(cube.getiWidth() == 5);
		assertTrue(cube.getiDepth() == 6);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void CuboidSetTest1() {
		Cuboid cube = new Cuboid(1, 2, 3);
		cube.setiLength(0);
		assertTrue(cube.getiLength() <= 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void CuboidSetTest2() {
		Cuboid cube = new Cuboid(1, 2, 3);
		cube.setiWidth(0);
		assertTrue(cube.getiLength() <= 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void CuboidSetTest3() {
		Cuboid cube = new Cuboid(1, 2, 3);
		cube.setiDepth(0);
		assertTrue(cube.getiLength() <= 0);
	}
	
	@Test
	public void CuboidAreaTest1() {
		Cuboid cube = new Cuboid(1, 2, 3);
		assertTrue(cube.area() == 22);
	}
	
	@Test
	public void CuboidAreaTest2() {
		Cuboid cube = new Cuboid(2, 2, 2);
		assertTrue(cube.area() == 24);
	}
}
