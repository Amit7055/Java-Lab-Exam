package assignment_Q5;

import java.util.Scanner;

class Customer {
	protected String name;
	protected String phoneNumber;
	Scanner scanner = new Scanner(System.in);

	public void readDetails() {
		System.out.println("Enter customer name:");
		name = scanner.nextLine();
		System.out.println("Enter customer phone number:");
		phoneNumber = scanner.nextLine();
	}

	public void displayDetails() {
		System.out.println("Customer Name: " + name);
		System.out.println("Phone Number: " + phoneNumber);
	}
}

