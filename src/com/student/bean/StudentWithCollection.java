package com.student.bean;

import java.util.Set;

import com.exam.bean.ExamWithCollection;

public class StudentWithCollection {
	private int rollNo;
	private String name;
	private int salary;
	private Set<String> books;
	private ExamWithCollection examData;

	public StudentWithCollection() {
	}

	public StudentWithCollection(int rollNo, String name, int salary, Set<String> books) {
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
		this.books = books;
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

	public Set<String> getBooks() {
		return books;
	}

	public void setBooks(Set<String> books) {
		this.books = books;
	}

	public ExamWithCollection getExamData() {
		return examData;
	}

	public void setExamData(ExamWithCollection examData) {
		this.examData = examData;
	}

	@Override
	public String toString() {
		return "StudentWithCollection [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + ", examData="
				+ examData + ", books=" + books + "]";
	}

}
