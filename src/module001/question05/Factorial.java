package module001.question05;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		long factorial = 1l;
		int numberloop = 0;

		do {
			System.out.println("Enter the number : ");
			number = Integer.parseInt(sc.nextLine());
			numberloop = number;
			do {
				factorial *= (numberloop--);
//				System.out.printf("%d - %d\n",number,factorial);
			} while (numberloop > 0);
			System.out.printf("Factorial of %d is %d\n", number, factorial);

			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		} while (true);
	}
}
