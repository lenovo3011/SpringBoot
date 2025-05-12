package RestAPI.Entities;

import java.util.List;

public interface methodsofCourses {
	
	public List<Course> getAllCourse () ;
	
	public Course getOneCourse(int id) ;
	
	public Course addCourse(Course course) ;
	
	public Course updateCourse (Course course , int id ) ;
	
	public void deleteCourse (int id )  ;
}