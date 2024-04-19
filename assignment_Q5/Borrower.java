package assignment_Q5;

import java.util.Scanner;

class Borrower extends Depositor {
	protected int loanNo;
	protected double loanAmt;
	Scanner scanner = new Scanner(System.in);

	@Override
	public void readDetails() {
		super.readDetails();
		System.out.println("Enter loan number:");
		loanNo = scanner.nextInt();
		System.out.println("Enter loan amount:");
		loanAmt = scanner.nextDouble();
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Loan Number: " + loanNo);
		System.out.println("Loan Amount: " + loanAmt);
	}
}
