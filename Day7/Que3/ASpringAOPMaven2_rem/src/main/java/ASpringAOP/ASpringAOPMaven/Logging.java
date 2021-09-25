package ASpringAOP.ASpringAOPMaven;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {
	@Before("execution(* *.*(..))")
	public void adv(JoinPoint jp)
	{
		System.out.println("beforeeeeeeee logginggggggggggggg11111 "+ 
				"JoinPoint: " +jp.getSignature().getName());
		
		Object args[] = jp.getArgs();
		for(Object obj:args)
		{
			System.out.println(obj+"");
		}
	}
	
	//AfterThrow
	@After("execution(* *.*(..))")
	public void adv1()
	{
		System.out.println("afterrrrrrrrr logginggggggggggggg11111");
	}
	
	@AfterThrowing(value= "execution(* *.*(..))", throwing= "exception")
	public void afterThrowingAdv(JoinPoint jp, Throwable exception) {
		System.out.println("Inside afterThrowingAdv() advice= " + jp.getSignature().getName() + " method");
		System.out.println("Exception = " + exception);
	}
		
	}

