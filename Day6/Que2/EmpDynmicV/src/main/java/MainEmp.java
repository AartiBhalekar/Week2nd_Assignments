import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEmp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		
		List<Employee> ep=new ArrayList<Employee>();
		ep.add(ctx.getBean(Employee.class,"Aarti",11,50,"addr1"));
		ep.add(ctx.getBean(Employee.class,"Aarti Bhalekar",111,1000,"addr2"));
		System.out.println("Employees are :");
		
		for (Employee emp: ep) {
			System.out.println(emp);
		}
	}
}
	
