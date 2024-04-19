package assignment_Q4;

import java.util.*;

public class TestStudent {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		StudentManagement system = new StudentManagement();
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Insert");
			System.out.println("2. Modify");
			System.out.println("3. Delete");
			System.out.println("4. Search");
			System.out.println("5. View All");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				system.insert();
				break;
			case 2:
				system.modify();
				break;
			case 3:
				system.delete();
				break;
			case 4:
				system.search();
				break;
			case 5:
				system.viewAll();
				break;
			case 6:
				System.out.println("Exiting program.");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 6);
		scanner.close();
	}

}
