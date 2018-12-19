package module001.question03;

import java.util.Scanner;

public class AddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		String numberAsString = "";
		int sum = 0;
		
		String[] stringArray = null;
		while (true) {
			System.out.println("Enter the number : ");
			numberAsString = sc.nextLine();
			number = Integer.parseInt(numberAsString);
			stringArray = numberAsString.split("");
//			System.out.println(Arrays.toString(stringArray));
			sum = 0;
			for(String a : stringArray) {
				sum += Integer.parseInt(a);
			}
			
			System.out.println(number + "'s sum of digits is :" + sum);
			
			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}
		}
	}
}
