package com.MulyilevelInheritance.constructor;

public class Subject extends Student 
{

	private String subject;
	private int marks;
	
	public Subject() 
	{
		//System.out.println("Enter subject and its marks ");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		
		System.out.println(subject);
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
		System.out.println(marks);
	}
		

}
