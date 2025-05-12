package ComponentScan;

import org.springframework.stereotype.Component;

@Component
public class Cat {
	public void eat () {
		System.out.println("The cat is eating food.");
	}

}
