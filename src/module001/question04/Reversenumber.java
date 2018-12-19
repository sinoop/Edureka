package module001.question04;

import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		String numberAsString = "";
		String reverseString = "";

		String[] stringArray = null;
		while (true) {
			System.out.println("Enter the number : ");
			numberAsString = sc.nextLine();
			number = Integer.parseInt(numberAsString);
			stringArray = numberAsString.split("");

			reverseString = "";
			int i = 0;
			while (i < stringArray.length) {
				reverseString = (stringArray[i++] + reverseString);
			}

			System.out.println(number + "'s reverse is :" + reverseString);

			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		}
	}
}
