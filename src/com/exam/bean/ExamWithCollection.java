package com.exam.bean;

import java.util.List;
import java.util.Map;

public class ExamWithCollection {
	private int eId;
	private String name;
	private int marks;
	private List<String> subject;
	private Map<String, Integer> markRecord;

	public ExamWithCollection(int eId, String name, int marks, List<String> subject, Map<String, Integer> markRecord) {
		this.eId = eId;
		this.name = name;
		this.marks = marks;
		this.subject = subject;
		this.markRecord = markRecord;
	}

	public Map<String, Integer> getMarkRecord() {
		return markRecord;
	}

	public void setMarkRecord(Map<String, Integer> markRecord) {
		this.markRecord = markRecord;
	}

	public ExamWithCollection() {
	}

	public ExamWithCollection(int eId, String name) {
		this.eId = eId;
		this.name = name;
	}

	public ExamWithCollection(int eId, String name, int marks, List<String> subject) {
		this.eId = eId;
		this.name = name;
		this.marks = marks;
		this.subject = subject;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "ExamWithCollection [eId=" + eId + ", name=" + name + ", marks=" + marks + ", subject=" + subject
				+ ", markRecord=" + markRecord + "]";
	}

}
