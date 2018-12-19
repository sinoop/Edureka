package module001.question02;

import java.util.Scanner;

public class LargestOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the two numbers ");
			int a = Integer.parseInt(sc.nextLine());
			int b = Integer.parseInt(sc.nextLine());

			System.out.println("Largest is : " + ((a > b) ? a : b));
			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}				
		}
	}
}
