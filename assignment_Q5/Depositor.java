package assignment_Q5;

import java.util.Scanner;

class Depositor extends Customer {
	protected int accNo;
	protected double balance;
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void readDetails() {
		super.readDetails();
		System.out.println("Enter account number:");
		accNo = scanner.nextInt();
		System.out.println("Enter balance:");
		balance = scanner.nextDouble();
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Account Number: " + accNo);
		System.out.println("Balance: " + balance);
	}
}

