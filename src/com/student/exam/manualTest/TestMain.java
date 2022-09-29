package com.student.exam.manualTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exam.bean.Exam;
import com.exam.bean.ExamNew;
import com.student.bean.Student;
import com.student.bean.StudentNew;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("OUTPUT OF SETTER INJECTION");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/student/resources/StudentSetter.xml");
		Student student = (Student) context.getBean("stu1");
		System.out.println(student);
		Exam exam = (Exam) context.getBean("exam1");
		System.out.println(exam);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("OUTPUT OF CONSTRUCTOR INJECTION");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/student/resources/StudentConstructor.xml");
		StudentNew student1 = (StudentNew) context1.getBean("stuNew1");
		System.out.println(student1);
		ExamNew exam2 = student1.getExamNew();
		System.out.println(exam2);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("OUTPUT OF CONSTRUCTOR INJECTION WITH INDEX");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/student/resources/StudentConstructorIndex.xml");
		StudentNew student2 = (StudentNew) context2.getBean("stuNew1");
		System.out.println(student2);
		ExamNew exam3 = student2.getExamNew();
		System.out.println(exam3);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		((AbstractApplicationContext) context2).close();
		((AbstractApplicationContext) context1).close();
		((AbstractApplicationContext) context).close();
	}

}
