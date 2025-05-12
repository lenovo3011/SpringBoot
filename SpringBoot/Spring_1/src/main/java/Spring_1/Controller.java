package Spring_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@ResponseBody
@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/home") 
	public String home () {
		
		return "This is a home page." ;
	}
	@GetMapping("/back") 
	public String back () {
		
		return "This is a back page." ;
	}

}
