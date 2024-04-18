package assignment_Q1;

public class Rectangle implements Shape {

	float length, width;

	public Rectangle(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public void calArea() {
		System.out.println("Area of the Rectangle  is : " + (length * width) + "cm");
	}

	@Override
	public void calPeri() {
		System.out.println("Perimeter of the Rectangle  is : " + (length + width) * 2 + "cm");
	}

}
