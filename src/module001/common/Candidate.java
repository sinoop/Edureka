package module001.common;

public class Candidate {
	String name;
	int age;
	public final static int VOTING_AGE = 18;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Boolean isVotingEligibile() {		
		return (this.age > Candidate.VOTING_AGE);
	}	
	
}
