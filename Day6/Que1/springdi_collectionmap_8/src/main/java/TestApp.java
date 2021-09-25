import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
public class TestApp{
 
	public static void main(String[] args)
	{
		ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\91973\\Downloads\\springdi_collectionmap_8-20210924T022851Z-001\\springdi_collectionmap_8\\src\\main\\java\\spconfig.xml");
		//ApplicationContext res = new ClassPathXmlApplicationContext("spconfig.xml");
		//BeanFactory factory = new XmlBeanFactory(res);
 
		Object obj = ac.getBean("id1");
		NewClass wb = (NewClass)obj;
 
		wb.show();
 
	}
 
}