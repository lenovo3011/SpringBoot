package ComponentScan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@ResponseBody
@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping ("/home") 
	public String home () {
		System.out.println("This is home method");
		return "This is home page"  ;
	}

}
