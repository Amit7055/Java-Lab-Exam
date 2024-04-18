package assignment_Q3;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printInfo() {
		System.out.println(empId + "\t" + empName + "\t" + salary);
	}
	
	public static Employee findMaxSal(Employee[] employee) {
        Employee maxSal = employee[0];
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSal.getSalary()) {
                maxSal = employee[i];
            }
        }
        return maxSal;
    }

}
