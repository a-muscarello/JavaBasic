package CoreJava.DAO;

import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.util.List;

// show all courses

public class CourseDAO {
	
	private List courseList;
	
    public List<Course> getAllCourses(int ID, String name, String instructor){
    	
    	     try {
    	        List<Student> studentSameName = Course.get(student.name);
    	        for(Student studentEntry : studentSameName){
    	            if(studentEntry.getStudentId() == student.getStudentId()){
    	                studentEntry.addCourse(courses);
    	            }
    	        }
    	     }
    	     catch(NullPointerException e){
    	         
    	     }
    	 }

    	    
    	
    	
			courseList.add(courseID);
			return coursesList.getAllCourses();
    }
}
