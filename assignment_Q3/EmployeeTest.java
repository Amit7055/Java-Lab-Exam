package assignment_Q3;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] employee = new Employee[5];
		employee[0] = new Employee(101, "ABC", 50000);
		employee[1] = new Employee(102, "XYZ", 60000);
		employee[2] = new Employee(103, "QWE", 55000);
		employee[3] = new Employee(104, "ZXC", 65000);
		employee[4] = new Employee(105, "PQR", 70000);

		System.out.println("Employee Information:");
		System.out.println("----------------------------------------------");
		System.out.println("EmpId\tEmpName\tSalary");
		System.out.println("----------------------------------------------");

		for (int i = 0; i < employee.length; i++) {
			employee[i].printInfo();
		}
		System.out.println("----------------------------------------------");
		Employee maxSal = Employee.findMaxSal(employee);

		System.out.println("Employee with Maximum Salary:");
		System.out.println("EmpId\tEmpName\tSalary");
		maxSal.printInfo();
	}

}
