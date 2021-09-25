import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
public class TestApp{
 
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
 
		Citizen citizen1 = ctx.getBean(Citizen.class);
		citizen1.setName("ABC");
		citizen1.setEmailAddress("abc@gmail.com");
		citizen1.setContactNumber("135798642");
		
		Citizen citizen2 = ctx.getBean(Citizen.class);
		citizen2.setName("James");
		citizen2.setEmailAddress("James@gmail.com");
		citizen2.setContactNumber("975318642");
		
		NewClass newClass = ctx.getBean(NewClass.class);
		Map<String, Citizen> data = new HashMap<String, Citizen>();
		
		data.put("2552", citizen1);
		data.put("8552", citizen2);
		
		newClass.setData(data);
		newClass.show();
		
 
	}
 
}