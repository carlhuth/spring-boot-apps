package sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public MyOptions myOptions() {
		return new MyOptions();
	}

}
