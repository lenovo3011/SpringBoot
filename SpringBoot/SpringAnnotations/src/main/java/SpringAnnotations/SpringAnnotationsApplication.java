package SpringAnnotations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ComponentScan.Cat;

@SpringBootApplication
public class SpringAnnotationsApplication implements CommandLineRunner {
	@Autowired
	@Qualifier("Rutvi")
	private Student student ;
	@Autowired
	private Date date ;
	
	@Autowired
	private Cat cat ;
	
	@Autowired
	private Emp emp ;
	public static void main(String[] args) {
		System.out.println("Application Started...");
		SpringApplication.run(SpringAnnotationsApplication.class, args);
		System.out.println("Application finished...");
		
		
	}
	@Override
	public void run(String... args) throws Exception {
		if (this.student != null) {
		this.student.studying(); }
		if (this.emp != null) {
			this.emp.myName();
		}
		
		this.cat.eat();
		
	}

}
