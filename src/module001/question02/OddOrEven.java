package module001.question02;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the number : ");
			int a = Integer.parseInt(sc.nextLine());
			if(a%2==0) {
				System.out.println(a + " is " + "even" );
			}else {
				System.out.println(a + " is " + "odd" );
			}
			
			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			}				
		}
	}
}
