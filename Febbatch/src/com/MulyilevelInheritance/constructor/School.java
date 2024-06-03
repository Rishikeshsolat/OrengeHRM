package com.MulyilevelInheritance.constructor;

public class School {

	private String schoolname;
	public String medium;
	
	School()
	{
		System.out.println("Enter school name,medium,classnumber,studentname,subject and its marks");
	}
	
	
	/*public School(String schoolname1, String medium1)
	{
		schoolname =schoolname1;
		medium = medium1;
		
	}*/


	public String getSchoolname() {
		return schoolname;
	}


	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
		System.out.println(schoolname);
	}


	public String getMedium() {
		return medium;
	}


	public void setMedium(String medium) {
		this.medium = medium;
		System.out.println(medium);
	}

}
