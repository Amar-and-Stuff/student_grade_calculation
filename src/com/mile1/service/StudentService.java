package com.mile1.service;
import com.mile1.bean.*;
public class StudentService {
	public int findNumberOfNullMarksArray(Student[] s) {
		int c = 0;
		if(s != null) {
			for(Student i : s) {
				if(i != null && i.getMarks() == null) {
					c++;
				}
			}
		}
		return c;
	}
	
	public int findNumberOfNullName(Student[] s) {
		int c = 0;
		if(s != null) {
			for(Student i : s) {
				if(i != null && i.getName() == null ) {
					c++;
				}
			}
		}
		return c;
	}
	
	public int findNumberOfNullObjects(Student[] s) {
		int c = 0;
		if(s != null) {
			for(Student i : s) {
				if(i != null && i == null ) {
					c++;
				}
			}
		}
		return c;
	}
}
