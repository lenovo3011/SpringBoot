package RestAPI.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import RestAPI.Entities.Course;
import RestAPI.Entities.methodsofCourses;
@Service
public class actualBody implements methodsofCourses  {
	
	List<Course> list ;
	
	public actualBody() {
		list = new ArrayList<> ();
		list.add(new Course (1002,"Core Java" , "This course contains basic of Core Java." , 3500)) ;
		list.add(new Course (1003,"Oracle 19c" , "This course contains basic of SQL." , 2000)) ;
		
	}

	@Override
	public List<Course> getAllCourse() {
		
		return list ;
	}

	@Override
	public Course getOneCourse(int id) {
		Course course = null; 
		for (Course c : list) {
			if (c.getId()==id) {
				course = c ;
				break ;
				
			}
			
		}
		return course  ;
		 
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course) ;
		return course ;
	}

	@Override
	public Course updateCourse(Course course, int id) {
		for (Course c : list) {
			if (c.getId()==id) {
				c.setcName(course.getcName());
				c.setDesc(course.getDesc());
				c.setFee(course.getFee());
				
				break ;
			}
		}
		return course ;
	}
	@Override
	public void deleteCourse(int id) {
		
		for (Course c : list) {
			if (c.getId() == id) {
				list.remove(c) ;
				break ;
			}
		}
	}
	
}
	
	
