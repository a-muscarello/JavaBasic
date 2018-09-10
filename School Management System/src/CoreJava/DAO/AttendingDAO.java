package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

// show all students attending courses
// register students to additional courses
// update student / course list

public class AttendingDAO {

	private List attendingList;
	
    public List<Attending> getAttending(){
		return null;

    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){
    	
    	File file = new File ("/Users/nycda/Desktop/students.csv");
    	
        try {
            OutputStreamWriter writer = new OutputStreamWriter( new FileOutputStream(file) );
            
            writer.close();
      
        } catch (IOException e) {
        	  System.out.println("File not found");
        	  e.printStackTrace();
        }
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){
		return courseList;

    }

    public void saveAttending(List<Attending> attending){

    }

}
