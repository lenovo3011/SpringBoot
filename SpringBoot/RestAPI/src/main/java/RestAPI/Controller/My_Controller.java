package RestAPI.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import RestAPI.Entities.Course;
import RestAPI.Entities.methodsofCourses;

import java.util.List;

@RestController
public class My_Controller {
	@Autowired
	private methodsofCourses list ;
	@GetMapping("/")  
	public String home () {
		return "Welcome to NareshIT!" ;
	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourse() 
	{return this.list.getAllCourse() ;
		
	}
	
	@GetMapping("/courses/{id}") 
	
	public Course getOneCourse (@PathVariable int id) {
		
		return this.list.getOneCourse(id) ;
	}
	
	
	@PostMapping("/courses") 
	
	public Course addCourse (@RequestBody Course course) {
		return this.list.addCourse (course) ;
		
	}
	
	
	@PutMapping("/courses/{id}") 
	
	public Course updateCourse (@PathVariable int id , @RequestBody Course course ) {
		return this.list.updateCourse (course , id) ;
		
	}
	
	@DeleteMapping("/courses/{id}")
	
	public String deleteCourse (@PathVariable int id ) {
		
		 this.list.deleteCourse (id) ;
		 
		 return "Course deleted with id "+ id+" ." ;
	}
	}