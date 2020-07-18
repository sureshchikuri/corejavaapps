package com.vcs.database.scrollable;

public class Student {

	private int studentNo;
	private String studentName;
	
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentNo="
				+ studentNo + "]";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
