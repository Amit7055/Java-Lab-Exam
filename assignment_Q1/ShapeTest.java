package assignment_Q1;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float radius, length, width;

		boolean exit = true;
		while (exit) {
			System.out.println("---------Calculate Area and Perimeter---------");
			System.out.println("1.Circle.\n2.Rectangle\n3.Exit\n:");
			int ch = scanner.nextInt();
			switch (ch) {
			case 1: {
				System.out.print("Enter Radius of circle : ");
				radius = scanner.nextFloat();
				Circle circle = new Circle(radius);
				circle.calArea();
				circle.calPeri();
				break;
			}

			case 2: {
				System.out.print("Enter Length of Rectangle : ");
				length = scanner.nextFloat();
				System.out.print("Enter width of Rectangle : ");
				width = scanner.nextFloat();
				Rectangle rectangle = new Rectangle(length, width);
				rectangle.calArea();
				rectangle.calPeri();
				break;
			}

			case 3: {
				System.out.println("Thank you.....");
				exit = false;
				break;
			}
			default:
				System.out.println("Enter valid options");
			}
		}
		scanner.close();
	}

}
