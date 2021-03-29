package ca.example.ktrojan.comit.exercisektrojan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
public class ExcersiseControler {

	
	@GetMapping("/joke")
	public String sayHelloWorld() {
		return "Second time in this place";
	}
	

}
