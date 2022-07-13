package entiti;

public class Product {

	public double width;
	public double height;

	public double Area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

}