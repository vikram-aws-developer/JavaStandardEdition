package com.jse.cloneDemo;


//This class demonstrates about cloning process with the help of clone() method from Object class
public class StudentMain {
	public static void main(String[] args) {
		
		Student student = new Student(95,"Vikram");		
		System.out.println(student.studentRollNumber+"\t"+student.studentName);
		
		try {
			Student student2 = (Student)student.clone();
			System.out.println(student2.studentRollNumber+"\t"+student2.studentName);
		}
		catch(CloneNotSupportedException cloneException) {
			cloneException.printStackTrace();
		}
		
		
		
	}

}
