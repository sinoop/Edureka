package module001.question05;

import java.util.Scanner;

public class Fibinocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int prev = 1;
		int current = 1;
		int temp = 0;

		do {
			System.out.println("Enter the number : ");
			number = Integer.parseInt(sc.nextLine());
			if (number >= 1) {
				System.out.print(prev + " ");
				number--;
			}

			if (number >= 1) {
				System.out.print(current + " ");
				number--;
			}
			
			if (number >= 1) {
				do {
					temp = current + prev;
					System.out.print(temp + " ");
					prev = current;
					current = temp;
					number--;
				} while (number > 0);
			}
			System.out.println("\nDo you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		} while (true);
	}

}