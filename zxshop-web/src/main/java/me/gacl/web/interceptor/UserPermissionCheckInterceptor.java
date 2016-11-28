package me.gacl.web.interceptor;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Aspect
public class UserPermissionCheckInterceptor {

	
	@Pointcut("execution(* me.gacl.web.controller..*.*(..))")
	public void controllerPointcut() {
		System.out.println("进入@Pointcut");
	}
	
	
	@Around("controllerPointcut()")
	public Object controlProcess(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("进入@Around");
		Object[] args = pjp.getArgs();
		
		Object  result = pjp.proceed(args);
		
		return result;
	}
}
