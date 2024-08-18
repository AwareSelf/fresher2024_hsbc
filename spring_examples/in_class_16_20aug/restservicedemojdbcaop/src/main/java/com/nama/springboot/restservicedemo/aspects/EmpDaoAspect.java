package com.nama.springboot.restservicedemo.aspects;

import com.nama.springboot.restservicedemo.model.Emp;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmpDaoAspect {

    Logger logger = LoggerFactory.getLogger(EmpDaoAspect.class);

    @Before(value="execution(* com.nama.springboot.restservicedemo.daorepo.EmpDaoRepo.*(..))")
    public void beforeAdvice(JoinPoint joinpoint)
    {
        logger.info("inside before Advice:"+joinpoint.getSignature() );

    }


    @Before(value="execution(* com.nama.springboot.restservicedemo.daorepo.EmpDaoRepo.save(..)) and args(e)")
    public void beforeAdvice1(JoinPoint joinpoint, Emp e)
    {
        logger.info("inside before Advice:"+joinpoint.getSignature() );
        logger.info("arg Emp with empId:"+e.getEmpId());
    }


    @AfterReturning(pointcut = "execution(* com.nama.springboot.restservicedemo.daorepo.EmpDaoRepo.save(..))",returning = "no")
    public void afterReturning(JoinPoint joinpoint,int no)
    {
        logger.info("inside after returning Advice:"+joinpoint.getSignature() );
        logger.info("no of emp saved:"+no);

    }


    @AfterThrowing(pointcut = "execution(* com.nama.springboot.restservicedemo.daorepo.EmpDaoRepo.save(..))",throwing = "ex")
    public void afterReturning(JoinPoint joinpoint,Exception ex)
    {
        logger.info("inside after throwing Advice:"+joinpoint.getSignature() );
        logger.info("exception thrown:msg=:"+ ex.getMessage());

    }

}
