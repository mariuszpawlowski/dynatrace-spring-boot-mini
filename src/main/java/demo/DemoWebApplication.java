package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoWebApplication {

	
	@RestController
	public static class MvcController {
	
		@RequestMapping("/")
		String home(){
			return "Hello world!!";
		}
	}

    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }
}
