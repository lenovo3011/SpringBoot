package Spring_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		System.out.println("Application Started...");
		SpringApplication.run(Spring1Application.class, args);
		System.out.println("Application finished...");
	}

}
