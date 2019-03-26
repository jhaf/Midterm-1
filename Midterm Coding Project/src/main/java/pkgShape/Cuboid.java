package pkgShape;

import java.util.Comparator; 

public class Cuboid extends Rectangle{
	
	private int iDepth;
	
	public Cuboid(int length, int width, int depth) {
		super(length, width);
		iDepth = depth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int depth) {
		this.iDepth = depth;
		if (depth <= 0) {
			throw new IllegalArgumentException("Depth < 0");
		}
	}
	
	public double volume() {
		return super.getiLength() * super.getiWidth() * this.getiDepth();		
	}
	
	@Override
	public double area() {
		return ((2 * super.getiLength() * super.getiWidth()) +
				(2 * super.getiLength() * iDepth) +
				(2 * super.getiWidth() * iDepth));
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter cannot be used");
	}
	
	public class SortByVolume implements Comparator<Cuboid> {
		public int compare(Cuboid cube1, Cuboid cube2) {
			return (int) cube1.volume() - (int) cube2.volume();
		}
	}
	
	public class SortByArea implements Comparator<Cuboid> {
		public int compare(Cuboid cube1, Cuboid cube2) {
			return (int) cube1.area() - (int) cube2.area();
		}
	}
}
