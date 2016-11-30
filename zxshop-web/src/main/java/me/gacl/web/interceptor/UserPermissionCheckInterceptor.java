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

		Signature signature = pjp.getSignature();
		if (!(signature instanceof MethodSignature)) {
			return pjp.proceed();
		}
		MethodSignature methodSignature = (MethodSignature) signature;

		Method method = methodSignature.getMethod();

		// 如果不是web请求方法 不做执行
		if (!method.isAnnotationPresent(RequestMapping.class)) {
			return pjp.proceed();
		}

		Object[] args = pjp.getArgs();

		Object result = pjp.proceed(args);
		System.out.println("退出@Around");
		return result;
	}
}
