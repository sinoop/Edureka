package module005_Collections.common.model;

public class Employee {
	String empId;
	String empName;
	Double salary;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/**
	 * @param empId
	 * @param empName
	 * @param salary
	 */
	public Employee(String empId, String empName, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee [ name = %s ; id = %s ; salary = %s ]", this.empName, this.empId, this.salary);
	}

	public int hashCode() {
		return this.empId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee that = (Employee) obj;
		if (this.empName.equals(that.empName)) {
			return true;
		} else {
			return false;
		}		
	}

}
