package SpringAnnotations;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages= {"ComponentScan"}) 

public class Configuation {
	
	@Bean("Raj")
	@Lazy
	public Student getStudent () {
		System.out.println("Creating student1 object..");
		return new Student("Raj") ;
	}
	@Bean 
	public Date getDate () {
		System.out.println("Todays date is \"06-May-2025\"");
		return new Date () ;
	}
	
	@Bean ("Rutvi")
	public Student createStudent () {
		System.out.println("Creting student2 object..");
		return new Student ("Rutvi") ;
		
	}
	

}
