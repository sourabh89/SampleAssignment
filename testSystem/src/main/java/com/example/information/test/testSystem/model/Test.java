package com.example.information.test.testSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Mongo database annotation.
@Document(collection= "studentDetails")
public class Test {

	@Id
	private int studentId;
	private String studentName;
	private String studentClass;
	private float totalMarks;

	public Test() {	}


	public int  getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public float getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Test{" +
				"studentId=" + studentId   +
				", studentName='" + studentName + '\'' +
				", studentClass='" + studentClass + '\'' +
				", totalMarks=" + totalMarks +
				'}';
	}
}