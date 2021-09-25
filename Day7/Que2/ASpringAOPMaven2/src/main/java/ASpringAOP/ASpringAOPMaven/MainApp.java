package ASpringAOP.ASpringAOPMaven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//Load configuration from XML
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		//retrieve Bean from Spring
		Employee emp = (Employee) ctx.getBean("e");
		System.out.println("----------before-----------");
		
		//invoke methods
		emp.getId();
		System.out.println("----------after-----------");
		
		String[] bean_names = ctx.getBeanDefinitionNames();
        for(String bean_name: bean_names)
        {
            System.out.println(bean_name);
        }
		
		/*System.out.println();
		emp.getName();
		System.out.println("---------------------");
		emp.setId(10);
		System.out.println();
		emp.setName("jdsg");
		*/
	}
}
