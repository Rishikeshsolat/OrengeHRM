package com.MulyilevelInheritance.constructor;

public class Student extends School {

	public String studentname;
	public int classnumber;
	
	public Student() {
		
		//System.out.println("enter Student name and classnumber ");
		
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
		System.out.println(studentname);
	}

	public int getClassnumber() {
		return classnumber;
	}

	public void setClassnumber(int classnumber) {
		this.classnumber = classnumber;
		System.out.println(classnumber);
	}

}
