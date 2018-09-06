package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.util.List;

// list all students
// show students / emails
// students validated to enter site (school management system)

public class StudentDAO {
	
	
    public List<Student>  getStudents(){
    	
    	String fileName = "/Users/nycda/Desktop/students.csv";
    	   
    	File file = new File("/Users/nycda/Desktop/students.csv");

    CsvFileReader.readCsvFile(students);
    
    FileReader fileReader = null;
        
	    try {
	    	
	    }
	    catch (Exception e) {
	        System.out.println("Error in CsvFileReader!");
	        e.printStackTrace();
	    } 
	    finally {
	
	        try {
	            //fileWriter.flush();
	            fileReader.close();
	            
	        } 
	        catch (Exception e) {
	            System.out.println("Error while closing fileReader!");
	            e.printStackTrace();
	        }
		return null;
	    }
    }

    public Student getStudentByEmail(List<Student> studentList, String studentEmail){
		return null;

    }

    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){
		return false;

    }
}
