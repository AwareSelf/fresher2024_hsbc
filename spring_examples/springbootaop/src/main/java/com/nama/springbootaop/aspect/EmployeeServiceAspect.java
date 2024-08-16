package com.nama.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.nama.springbootaop.beans.Emp;
import com.nama.springbootaop.service.EmployeeService;

@Aspect
@Component
public class EmployeeServiceAspect {

	Logger log = LoggerFactory.getLogger(EmployeeService.class);
	
	@Before(value = "execution(* com.nama.springbootaop.service.EmployeeService.*(..)) "
			+ "and args(empId,empName)")
	public void beforeAdvice(JoinPoint joinPoint, int empId,String empName) {
		log.info("aspect:Before method:" + joinPoint.getSignature());

		log.info("aspect:Creating Employee with name - " + empName + " and id - " + empId);
	}

	/*@After(value = "execution(* com.nama.springbootaop.service.EmployeeService.*(..)) "
			+ "and args(empId,empName)")
	public void afterAdvice(JoinPoint joinPoint, int empId,String empName) {
		log.info("aspect:After method:" + joinPoint.getSignature());

		log.info("aspect:Created Employee with name - " + empName + " and id - " + empId);
	}*/
		
	@AfterReturning(pointcut="execution(* com.nama.springbootaop.service.EmployeeService.*(..))", returning="emp")
	public void logReturnValue(JoinPoint joinPoint,Emp emp)
	{
		log.info("aspect:emp return from service.EmployeeService"+emp);
	}

	@AfterThrowing(pointcut="execution(* com.nama.springbootaop.service.EmployeeService.*(..))", throwing="ex")
	public void logExceptionValue(Exception ex)
	{
		log.info("aspect:exception thrown  from service.EmployeeService"+ex.getMessage());
	}

	@Around("execution(* com.nama.springbootaop.service.EmployeeService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		Object result = null;
		// Custom logic before the method execution
		log.info("around advice:Before method execution"+joinPoint.getSignature());

		try {
			// Proceed with the actual method execution
			result = joinPoint.proceed();

			System.out.println(result);
		}
		catch(Exception e)
		{
			log.error("exception caught in around advice:"+e.getMessage());
			throw e;
		}
		// Custom logic after the method execution
		log.info("around advice:After method execution");

		return result;
	}
}
