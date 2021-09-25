package ASpringAOP.ASpringAOPMaven;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {
	@Before("execution(* *.*(int))")
	public void adv0()
	{
		System.out.println("beforeeeeeeee logging");
	}

	@Before("execution(* *.*(String))")
	public void adv()
	{
		System.out.println("beforeeeeeeee logging");
	}
	
	//AfterThrow
	@After("execution(* *.*(..))")
	public void adv1()
	{
		System.out.println("afterrrrrrrrr logging");
	}
}
