package com.student.bean;

import com.exam.bean.ExamNew;

public class StudentNew {
	private int rollNo;
	private String name;
	private int salary;
	private ExamNew exam;

	public StudentNew() {
	}

	public StudentNew(int rollNo, String name, int salary, ExamNew exam) {
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
		this.exam = exam;
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

	public ExamNew getExamNew() {
		return exam;
	}

	public void setExamNew(ExamNew exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "StudentNew [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + ", exam=" + exam + "]";
	}

}
