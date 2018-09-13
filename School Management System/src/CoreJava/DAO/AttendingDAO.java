package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

// show all students attending courses
// register students to additional courses
// update student / course list

public class AttendingDAO {

	private List<Attending> attendingList = new ArrayList<Attending>();

	
    public List<Attending> getAttending() {
		
    	String attendingCSV = "/Users/nycda/Desktop/Final_Project/attending.csv";
    	
    	File file = new File(attendingCSV);
    	BufferedReader reader;
    	String attending;
    	
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((attending = reader.readLine()) != null) {
				String[] attendingValues = attending.split(",");
				Attending theAttending = new Attending(Integer.parseInt(attendingValues[0]), attendingValues[1]);  	
				attendingList.add(theAttending);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return attendingList;
    }

	
   
    public void registerStudentToCourse(List<Attending> attendingList, String studentEmail, int courseID){
    	
    	boolean notAttending = true;
    	for (Attending attending: attendingList) {
    		if ((attending.getStudentEmail()) == studentEmail && (attending.getCourseID()) == courseID) {
    			System.out.println("Student already registered for this course!");
    			notAttending = false;
    		}
    	}
    	if (notAttending) {
    		Attending newAttending = new Attending(courseID, studentEmail);
    		attendingList.add(newAttending);
    	}
}

    
    
    List<Course> studentCourseList;
    
    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attendingList, String studentEmail) {
    	
		for (Attending attending: attendingList) {
    		if ((attending.getStudentEmail()) == studentEmail) {    			
    			for (Course course: CourseDAO.courseList) {
    				if (course.getID() == attending.getCourseID()) {
    					Course studentCourse = course;
    					studentCourseList.add(studentCourse);
    				}
    			}
    		}
    	}
    	return studentCourseList;
}

    
    
    public void saveAttending(List<Attending> attendingList) {
    
    	File attendingCSV = new File("/Users/nycda/Desktop/Final_Project/attending.csv");
    	attendingCSV.delete();
    	File newAttendingCSV = new File("/Users/nycda/Desktop/Final_Project/attending.csv");
    	
		try {
			FileWriter writer = new FileWriter(newAttendingCSV, false);
			for (Attending attending: attendingList) {
	            writer.write(attending.getCourseID() + "," + attending.getStudentEmail());
	    	}
	    	writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
}