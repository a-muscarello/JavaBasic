package CoreJava.DAO;

import CoreJava.Models.Course;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// use filereader to show all courses in the csv file
// print out the courselist


public class CourseDAO {
	
	static List<Course> courseList = new ArrayList<Course>();

    public List<Course> getAllCourses() {
    	
    	String coursesCSV = "/Users/nycda/Desktop/Final_Project/courses.csv";
    	
    	File file = new File(coursesCSV);
    	BufferedReader reader;
    	String course;
    	
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((course = reader.readLine()) != null) {
				String[] courseValues = course.split(",");
				Course theCourse = new Course(Integer.parseInt(courseValues[0]), courseValues[1], courseValues[2]);   
				courseList.add(theCourse);
	    	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return courseList;
    }
			
}

