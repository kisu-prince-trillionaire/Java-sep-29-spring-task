package com.student.bean;

public class Student {
	private int rollNo;
	private String name;
	private int salary;

	public Student() {
	}

	public Student(int rollNo, String name, int salary) {
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + "]";
	}

}
