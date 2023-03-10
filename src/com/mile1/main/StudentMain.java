package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.service.*;
import com.mile1.exception.*;
public class StudentMain {
	static Student[] data = new Student[4];
	static StudentReport reporter = new StudentReport();
	StudentMain() {
		
		/* for(int i = 0; i < data.length; i++) {
			data[i] = new Student(); // have to initialze
		} */
		data[0] = new Student("Shekar",new int[] {85,75,95});
		data[1] = new Student("Ajay", new int[] {25,75,95});
		data[2] = new Student("Kamlesh", new int[] {48,91,87});
		data[3] = new Student("Manoj",new int[] {52,67,90});
	}
	
	public static void main(String[] arg) {
		new StudentMain();
		for(Student i : data) {
			try {
				if(reporter.validate(i).contentEquals("VALID")) {
					i.setGrade(reporter.findGrades(i));
					System.out.println("Grade of "+i.getName()+" is "+i.getGrade());
				}
			}
			catch(NullMarksArrayException nmae) {
				nmae.printStackTrace();
			}
			catch(NullNameException nne) {
				nne.printStackTrace();
			}
			catch(NullStudentObjectException nsoe) {
				nsoe.printStackTrace();
			}
		}
		
		StudentService studentService = new StudentService();
		System.out.println("Number of null mark arrays : "+studentService.findNumberOfNullMarksArray(data));
		System.out.println("Number of null names : "+studentService.findNumberOfNullName(data));
		System.out.println("Number of null Student objects : "+studentService.findNumberOfNullObjects(data));

	}
}
