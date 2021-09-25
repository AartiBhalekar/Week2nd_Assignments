package ASpringAOP.ASpringAOPMaven;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging2 {
	@Before("execution(* *.*(..))")
	public void adv()
	{
		System.out.println("bbbbbeforeeeeeeee loggingggggggggggg1111111");
	}
	
	//AfterThrow
	@After("execution(* *.*(..))")
	public void adv1()
	{
		System.out.println("aaaaaaafterrrrrrrrr logginggggggggggggggggggg");
	}
}
