package module001.question02;

import java.util.Scanner;

public class CheckIfPositive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0; 
		while(true){
			System.out.println("Enter the number : ");
			number = Integer.parseInt(sc.nextLine());
						
			if(number>0){
				System.out.println(number + "is Positive ");
			}else if(number ==0 ){
				System.out.println(number + "is neither positive or negative ");
			}else {
				System.out.println(number + "is negative ");
			}
			
			System.out.println("Do you want to Continue ? (Y/N)");
			if(sc.nextLine().equals("N")) {
				break;
			}			
		}
		sc.close();
	}
}
