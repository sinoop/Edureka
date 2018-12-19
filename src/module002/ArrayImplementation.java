package module002;

import java.util.Scanner;

public class ArrayImplementation {
	static final int LIMIT = 2;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] ids = new String[ArrayImplementation.LIMIT];
		String[] names = new String[ArrayImplementation.LIMIT];
		Double[] salaries = new Double[ArrayImplementation.LIMIT];
		String empId;
		String empName;
		Double salary;
		ArrayImplementation arr = new ArrayImplementation();
		String nameToSearch = "";

		while (true) {
			for (int i = 0; i < ArrayImplementation.LIMIT; i++) {
				System.out.printf("====> Details of %d Employee :\n", i + 1);
				System.out.println("Enter the id     : ");
				empId = sc.nextLine();
				System.out.println("Enter the name   : ");
				empName = sc.nextLine();
				System.out.println("Enter the salary : ");
				salary = Double.parseDouble(sc.nextLine());

				ids[i] = empId;
				names[i] = empName;
				salaries[i] = salary;
			}

			arr.display(ids, names, salaries);
			arr.display(ids, names);

			System.out.println("Enter the name to search : ");
			nameToSearch = sc.nextLine();
			arr.display(nameToSearch, ids, names, salaries);

			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		}
	}

	private void display(String[] ids, String[] names, Double[] salaries) {
		System.out.printf("%-10s %-10s %10s\n", "ID", "Name", "Salary");
		for (int i = 0; i < ArrayImplementation.LIMIT; i++) {
			System.out.printf("%-10s %-10s %8.2f\n", ids[i], names[i], salaries[i]);
		}

	}

	private void display(String[] ids, String[] names) {
		System.out.printf("%-10s %-10s \n", "ID", "Name");
		for (int i = 0; i < ArrayImplementation.LIMIT; i++) {
			System.out.printf("%-10s %-10s\n", ids[i], names[i]);
		}
	}

	private void display(String nameToDisplay, String[] ids, String[] names, Double[] salaries) {
		String output = String.format("%-10s %-10s %10s\n", "ID", "Name", "Salary");
		Boolean found = false;

		for (int i = 0; i < ArrayImplementation.LIMIT; i++) {
			if (nameToDisplay == names[i]) {
				output += String.format("%-10s %-10s %8.2f\n", ids[i], names[i], salaries[i]);
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(output);
		} else {
			System.out.println("No matching entry found");
		}

	}
}
