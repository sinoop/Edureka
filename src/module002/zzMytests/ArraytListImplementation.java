package module002.zzMytests;

import java.util.ArrayList;
import java.util.Scanner;

import module002.common.model.Employee;

public class ArraytListImplementation {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		ArrayList<Employee> employees;
		int count = 0;
		while (true) {
			employees = new ArrayList<>();
			System.out.println("Enter the number of Employees :");
			count = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < count; i++) {
				System.out.printf("====> Details of %d Employee :\n", i+1);
				addEmployeeTo(employees);
			}

			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		}
	}

	private static void addEmployeeTo(ArrayList<Employee> employees) {
		String empId;
		String empName;
		Double salary;
		System.out.println("Enter the id     : ");
		empId=sc.nextLine();
		System.out.println("Enter the name   : ");
		empName=sc.nextLine();
		System.out.println("Enter the salary : ");
		salary=sc.nextDouble();		
		Employee e = new Employee(empId, empName, salary);
		employees.add(e);		
	}
}
