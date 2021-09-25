package ASpringAOP.ASpringAOPMaven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//Load configuration from XML
		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\91973\\Downloads\\ASpringAOPMaven_17-20210921T045558Z-001\\ASpringAOPMaven_17\\src\\main\\java\\Beans.xml");
		
		//retrieve Bean from Spring
		Employee emp = (Employee) ctx.getBean("e");
		System.out.println("----------before-----------");
		
		//invoke methods
		emp.getId();
		System.out.println("----------after-----------");
		
		
		/*System.out.println();
		emp.getName();
		System.out.println("---------------------");
		emp.setId(10);
		System.out.println();
		emp.setName("jdsg");
		*/
	}
}
