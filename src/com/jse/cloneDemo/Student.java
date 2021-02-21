package com.jse.cloneDemo;

public class Student implements Cloneable {
	
	int studentRollNumber;
	String studentName;
	
	public Student(int studentRollNumber,String studentName){
	this.studentRollNumber=studentRollNumber;
	this.studentName=studentName;
	}

	 protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
