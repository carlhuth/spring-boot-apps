package sample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class DemoApplication {

	@Autowired
	MyOptions myOptions

	@RequestMapping("/")
	def helloWorld() {
		String msg = "Hello world! The current speed is: ${myOptions?.speed}"
		[message: msg]
	}

	static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args)
	}


}
