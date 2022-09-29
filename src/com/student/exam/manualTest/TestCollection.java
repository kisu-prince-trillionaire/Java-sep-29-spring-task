package com.student.exam.manualTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exam.bean.ExamWithCollection;
import com.student.bean.StudentWithCollection;

public class TestCollection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/student/resources/ExamScope.xml");
		StudentWithCollection student = (StudentWithCollection) context.getBean("stuCollection1");
		System.out.println(student);
		System.out.println(student.getBooks());
		ExamWithCollection exam = (ExamWithCollection) context.getBean("examCollection1");
		System.out.println(exam);
		System.out.println(exam.getMarkRecord());
		System.out.println(exam.getSubject());
		
		System.out.println("OUTPUT AFTER AUTOWIRE");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/student/resources/Autowire.xml");
		StudentWithCollection student1 = (StudentWithCollection) context.getBean("stuCollection1");
		System.out.println(student1);
		System.out.println(student1.getBooks());
		ExamWithCollection exam1 = (ExamWithCollection) context1.getBean("examCollection1");
		System.out.println(exam1);
		System.out.println(exam1.getMarkRecord());
		System.out.println(exam1.getSubject());
		
		
		((ClassPathXmlApplicationContext) context1).close();
		((ClassPathXmlApplicationContext) context).close();
	}

}
