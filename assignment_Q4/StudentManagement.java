package assignment_Q4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

	private ArrayList<Student> student = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public void insert() {
		System.out.println("ENter number of entries...");
		byte size = scanner.nextByte();
		for (byte i = 0; i < size; i++) {
			System.out.println("Enter student ID:");
			int id = scanner.nextInt();
			System.out.println("Enter student name:");
			String name = scanner.next();
			student.add(new Student(id, name));
		}
		System.out.println("Student inserted successfully.");
	}

	public void modify() {
		System.out.println("Enter student ID to modify:");
		int idd = scanner.nextInt();
		for (Student student2 : student) {
			if (student2.getId() == idd) {
				System.out.println("Enter new name:");
				student2.setName(scanner.next());
				System.out.println("Student modified successfully.");
			}
		}
		System.out.println("Student not found.");
	}

	public void delete() {
		System.out.println("Enter student ID to delete:");
		int id = scanner.nextInt();
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getId() == id) {
				student.remove(i);
				System.out.println("Student deleted successfully.");
				return;
			}
		}
		System.out.println("Student not found.");
	}

	public void search() {
		System.out.println("Enter student ID to delete:");
		int id = scanner.nextInt();
		for (Student student2 : student) {
			if (student2.getId() == id) {
				System.out.println("ID: " + student2.getId() + ", Name: " + student2.getName());
			}
		}
		System.out.println("Student not found.");
	}

	public void viewAll() {
		if (student.isEmpty()) {
			System.out.println("No students to display.");
		} else {
			for (Student student2 : student) {
				System.out.println("ID: " + student2.getId() + ", Name: " + student2.getName());
			}
		}
	}

}
