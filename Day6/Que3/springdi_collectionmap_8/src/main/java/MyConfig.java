import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	@Bean 
	@Scope("prototype")
	public Citizen getCBean(){
		System.out.println("public Citizen getCBean()");
		return new Citizen();
	}
	
	@Bean
	@Scope("prototype")
	public NewClass getNBean() {
		System.out.println("public NewClass getNBean()");
		return new NewClass();
	}

}
