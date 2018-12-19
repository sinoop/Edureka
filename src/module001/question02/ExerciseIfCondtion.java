package module001.question02;

import java.util.Scanner;

import module001.common.Candidate;

public class ExerciseIfCondtion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		while(true){
			Candidate c = new Candidate();
			
			System.out.println("Enter the name of Candidate : ");
			c.setName(sc.nextLine());
			
			System.out.println("Enter the age of Candidate : ");
			c.setAge(Integer.parseInt(sc.nextLine()));			
			
			if(!c.isVotingEligibile()){
				System.out.println(c.getName() + "is not Eligible to vote. Minimum age is " + Candidate.VOTING_AGE);
			}else {
				System.out.println(c.getName() + "is Eligible to vote");
			}
			
			System.out.println("Do you want to Continue ? (Y/N)");
			if(sc.nextLine().equals("N")) {
				break;
			}			
		}
		sc.close();
		
	}
}
