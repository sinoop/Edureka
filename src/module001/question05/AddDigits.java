package module001.question05;

import java.util.Scanner;

public class AddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		String numberAsString = "";
		int sum = 0;

		String[] stringArray = null;
		do {
			System.out.println("Enter the number : ");
			numberAsString = sc.nextLine();
			number = Integer.parseInt(numberAsString);
			stringArray = numberAsString.split("");
//			System.out.println(Arrays.toString(stringArray));
			int i = 0;
			sum = 0;
			do {
				sum += Integer.parseInt(stringArray[i++]);
			} while (i < stringArray.length);
			System.out.println(number + "'s sum of digits is :" + sum);

			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		} while (true);
	}
}
