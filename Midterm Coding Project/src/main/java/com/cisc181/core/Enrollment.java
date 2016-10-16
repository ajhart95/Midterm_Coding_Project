package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	public UUID SectionID;
	public UUID StudentID;
	public UUID EnrollmentID;
	public double Grade;
	
	private Enrollment(){
		SetEnrollmentID(EnrollmentID);
	}
	
	private Enrollment(UUID StudentID, UUID SectionID){
		this();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		
	}
	
	public void SetEnrollmentID(UUID EnrollmentID){
		this.EnrollmentID = EnrollmentID;
	}
	
	public void SetGrade(double Grade){
		this.Grade = Grade;
	}
}
