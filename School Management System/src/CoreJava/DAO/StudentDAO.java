package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.io.FileReader;
import java.util.List;

// list all students
// show students / emails
// students validated to enter site (school management system)

public class StudentDAO {
	
    private List studentList;
	
    public List<Student>  getStudents(){
    		return this.studentList;
    	
    	String fileName = "/Users/nycda/Desktop/students.csv";
    	   
    	File file = new File("/Users/nycda/Desktop/students.csv");

    CsvFileReader.readCsvFile(studentList);
//    CsvFileReader.readCsvFile(fileName);
    
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
    	
    	if((studentEmail).equals(setEmail) && (studentPass).equals(setPass)) {
//    	if((studentEmail == setEmail) && (studentPass == setPass)) {
            System.out.println("Login Successful!");
        }
        else{
            System.out.println("Incorrect username or password");
        }

		return false;
    }
}
