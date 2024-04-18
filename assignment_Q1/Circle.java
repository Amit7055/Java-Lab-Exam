package assignment_Q1;

public class Circle implements Shape {

	float radius;

	public Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public void calArea() {
		System.out.println("Area of circle is : " + (PI * Math.pow(radius, 2)) + "cm");
	}

	@Override
	public void calPeri() {
		System.out.println("Perimeter  of circle is : " + (2 * PI * radius) + "cm");
	}
}
