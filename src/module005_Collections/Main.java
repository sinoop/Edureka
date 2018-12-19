package module005_Collections;

import module005_Collections.collections.ArrayListAssignment;
import module005_Collections.collections.HashMapAssignmant;
import module005_Collections.collections.HashTableAssignment;
import module005_Collections.common.model.Employee;
import module005_Collections.common.model.Student;
import module005_Collections.wrapper.IntegerWrapper;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------- Integer Wrapper Class Demonstration ----------");
		IntegerWrapper iw = new IntegerWrapper();
		iw.showTheWork();
		System.out.println("---------- Integer Wrapper Class Demonstration ----------");

		System.out.println("---------- ArrayList Demonstration ----------");
		ArrayListAssignment<Integer> arr = new ArrayListAssignment<>();
		for (int i = 0; i < 10; i++) {
			arr.additem(i);
		}
		arr.display();
		System.out.println("---------- ArrayList Demonstration ----------");
		
		
		System.out.println("---------- HashMap Demonstration ----------");
		Employee[] array = new Employee[5];
		array[0] = new Employee("123", "George", 10000.00);
		array[1] = new Employee("124", "Neelam", 20000.00);
		array[2] = new Employee("125", "John", 30000.00);
		array[3] = new Employee("126", "Alex", 40000.00);
		array[4] = new Employee("127", "Samson", 50000.00);

		HashMapAssignmant hma = new HashMapAssignmant();
		for (Employee e : array) {
			hma.additemToMap(e.getEmpId(), e);
		}

		hma.display();
		System.out.println("---------- HashMap Demonstration ----------");

		System.out.println("---------- HashTable Demonstration ----------");
		Student[] stArray = new Student[5];
		stArray[0] = new Student("123", "George", 20.00);
		stArray[1] = new Student("124", "Neelam", 30.00);
		stArray[2] = new Student("125", "John", 100.00);
		stArray[3] = new Student("126", "Alex", 89.00);
		stArray[4] = new Student("127", "Samson", 78.00);

		HashTableAssignment hta = new HashTableAssignment();
		for (Student e : stArray) {
			hta.addEntry(e.getStudentId(), e);
		}

		hta.display();
		hta.displayCurrentTopper();
		System.out.println("---------- HashTable Demonstration ----------");
	}
}
