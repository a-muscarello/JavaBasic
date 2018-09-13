package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
// create a list to show all students and print out studentlist
// get student from the list via email
// students validated to enter site (school management system) from email and their password


public class StudentDAO {
	
	private List<Student> studentList = new ArrayList<Student>();

    public List<Student>  getStudents() {
    	
     	String studentsCSV = "/Users/nycda/Desktop/Final_Project/students.csv";
		
    	File file = new File(studentsCSV);
    	BufferedReader reader;
    	String student;
    	
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((student = reader.readLine()) != null) {
				System.out.println(student);
				String[] studentInfo = student.split(",");
				Student theStudent = new Student(studentInfo[0], studentInfo[1], studentInfo[2]);
				studentList.add(theStudent);
		    	}
			} catch (Exception e) {
				e.printStackTrace();
		}
		return studentList;
    }
    
    
    
    public Student getStudentByEmail(List<Student> studentList, String studentEmail) {
    	
	    	for (Student student: studentList) {
	    		if (studentEmail.equals(student.getEmail())) {
	                System.out.println("Login Successful!");
	                return student;
	            }
	    	}
		return null;
    }
    
    
    
    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass) {
	    	for (Student student: studentList) {
	    		if (studentEmail.equals(student.getEmail()) && studentPass.equals(student.getPass())) {
	                System.out.println("Login Successful!");
	                return true;
	            }
	            else {

	                return false;
	            }
	    	}
	    	return false;
    } 
    
}


	
	