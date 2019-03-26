package pkgShape;

public class Rectangle extends Shape{
	
	private int iLength;
	private int iWidth;
	
	public Rectangle(int length, int width) {
		super();
		iLength = length;
		iWidth = width;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int length) {
		this.iLength = length;
		if (length <= 0) {
			throw new IllegalArgumentException("Length < 0");
		}
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int width) {
		this.iWidth = width;
		if (width <= 0) {
			throw new IllegalArgumentException("Width < 0");
		}
	}
	
	public double perimeter() {
		return (this.getiLength() * 2) + (this.getiWidth() * 2);
		
	}
	public double area() {
		return this.getiLength() * this.getiWidth();
		
	}
	
	public int compareTo(Object o){
		Rectangle r = (Rectangle) o;
		return (int) this.area() - (int) r.area();
		}
}
