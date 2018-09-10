package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

import java.util.List;

// show all students attending courses
// register students to additional courses
// update the student / course list

public class AttendingDAO {

	private List attendingList;
	
    public List<Attending> getAttending(){
		return null;

    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){

    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){
		return courseList;

    }

    public void saveAttending(List<Attending> attending){

    }

}
