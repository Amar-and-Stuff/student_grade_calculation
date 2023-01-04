package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.*;
public class StudentReport {
	
	public String findGrades(Student studentObject) {
		int sum = 0;
		for(int i : studentObject.getMarks()) {
			sum += i;
			if(i < 35) {
				return "F";
			}
		}
		if(sum < 150) {
			return "C";
		} else if(sum < 200) {
			return "B";
		} else if(sum < 250) {
			return "A";
		} else {
			return "A+";
		}
	}

	public String validate(Student s) throws NullMarksArrayException, NullNameException, NullStudentObjectException {
		if(s == null) {
			throw new NullStudentObjectException();
		} else if(s.getName() == null) {
			throw new NullNameException();
		} else if(s.getMarks() == null) {
			throw new NullMarksArrayException();
		}
		return "VALID";
	}
}
