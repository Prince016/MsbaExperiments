package deom.colm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Prashant 19csu219


@RestController
@SpringBootApplication
public class DemoApplication {

	@RequestMapping(value = "/")
	public String index(){
		return "<h1>  Hi Prashant  </h1>";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
