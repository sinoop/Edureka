package module005_Collections.common.model;

public class Student implements Comparable<Student> {
	String studentId;
	String studentName;
	Double marks;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getmarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	/**
	 * @param studentId
	 * @param studentName
	 * @param marks
	 */
	public Student(String studentId, String studentName, Double marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return String.format("Student [ name = %s ; id = %s ; marks = %s ]", this.studentName, this.studentId,
				this.marks);
	}

	public int compareTo(Student otherStudent) {
		if (this.marks >= otherStudent.marks) {
			return 1;
		} else {
			return -1;
		}
	}

}
