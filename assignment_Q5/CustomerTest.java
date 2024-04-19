package assignment_Q5;

import java.util.Scanner;

public class CustomerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of customers:");
		int n = scanner.nextInt();
		Borrower[] borrower = new Borrower[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter details for customer " + (i + 1) + ":");
			borrower[i] = new Borrower();
			borrower[i].readDetails();
		}

		System.out.println("\nDetails of Customers:");
		for (int i = 0; i < n; i++) {
			System.out.println("\nDetails of customer " + (i + 1) + ":");
			borrower[i].displayDetails();
		}
		scanner.close();
	}
}
