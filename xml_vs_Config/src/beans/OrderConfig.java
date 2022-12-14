package beans;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// like xml confiuration of all thirdparty beans which are not your classes
@Configuration
public class OrderConfig {
	//<bean class="java.util.Date"/> 
	@Bean
	public Date createDate() {
		Date d = new Date();
		return d;
	}
}
