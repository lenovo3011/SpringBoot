package StudentAppWithDB.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import StudentAppWithDB.entity.Student;
import StudentAppWithDB.DAO.DAO;
import StudentAppWithDB.Service.methodsofDB ;


@Controller
public class ControllerDB {
	@Autowired
	private methodsofDB var ;
	@Autowired
	private DAO jpa ; 
	
	
	
	
	@GetMapping("/addstudent") 
	public String addStudent (Model model) {
		model.addAttribute("student" , new Student()) ;
		return "addstudent" ;
	}
	@GetMapping("/update/{id}")
	public String updateData (@PathVariable String id, Model model ) {
		Optional<Student> data = jpa.findById(id) ;
		model.addAttribute("student" , data) ;
		return "update";
	}
	
	@PostMapping("/submit")
	public String submitForm(@ModelAttribute Student student ) {
		jpa.save(student) ;
		return "liststudent";
	}
	
	@GetMapping("/") 
	public String home () {
		
		return "home" ;
	}
	
	@GetMapping("/allstudents") 
	public String allStudents (Model student)
	{List<Student> students = var.getAllStudent() ;
	student.addAttribute("students" , students) ;
		return "liststudent" ;
	}	
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Void> deleteItem(@PathVariable String id) {
		jpa.deleteById(id) ;
		System.out.println("Id ====> " + id);
		
	    return ResponseEntity.ok().build(); // Return 200 OK
	}
	
	

	/*
	
//	@GetMapping("/students") 
//	public List<Student> getAllStudent () {
//		return this.var.getAllStudent() ;
//		
//	}
	
	@GetMapping("/students")
	public String getAllStudents (@ModelAttribute Model student) {
		List<Student> students = var.getAllStudent() ;
		student.addAttribute("students" , students ) ;
		return "students" ;
	}
	
	@GetMapping("/students/{rollno}")
	
	public Student getOneStudent (@PathVariable String rollno) {
		return this.var.getOneStudent(rollno) ;
	}
	
	@PostMapping("/students")
	public Student addStudent (@RequestBody Student student) {
		
		return this.var.addStudent(student) ;
		
	}
	
	@PutMapping("/students")
	
	public Student updateStudent(@RequestBody Student student) {
		return this.var.updateStudent(student ) ;
	}
	
	@DeleteMapping("/students/{rollno}")
	
	public String deleteStudent (@PathVariable String rollno) {
		if (this.var.deleteStudent(rollno) ) return "Deleted !"  ;
		else return "Not deleted ! " ;

		
	}*/
}
