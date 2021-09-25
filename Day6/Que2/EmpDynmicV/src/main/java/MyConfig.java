import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
class MyConfig{
	@Bean 
	@Scope("prototype")
	public Employee getEBean(String a,int b, int c, String d){
		System.out.println("public Employee getEBean()");
		return new Employee(a,b,c,d);
	}	
	
}