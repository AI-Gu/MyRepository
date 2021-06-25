package com.yjgu.web.aop;

import com.yjgu.web.annotation.SystemControllerLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Map;

@Aspect
@Component
public class SysLogAop {

    private Logger logger = LoggerFactory.getLogger(SysLogAop.class);

    @Pointcut("@annotation(com.yjgu.web.annotation.SystemControllerLog)")
    public void controllerLog() {

    }

    @Before("controllerLog()")
    public void beforeController(JoinPoint joinPoint) {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);

        Map<String, String[]> parameterMap = httpServletRequest.getParameterMap();

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        Method method = signature.getMethod();

        SystemControllerLog annotation = method.getAnnotation(SystemControllerLog.class);

        System.out.println("before" + annotation.description());
    }

    @After("controllerLog()")
    public void afterController(JoinPoint joinPoint) {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);

        Map<String, String[]> parameterMap = httpServletRequest.getParameterMap();

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        Method method = signature.getMethod();

        SystemControllerLog annotation = method.getAnnotation(SystemControllerLog.class);

        System.out.println("after" + annotation.description());
    }

    @AfterReturning("controllerLog()")
    public void afterReturningController(JoinPoint joinPoint) {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);

        Map<String, String[]> parameterMap = httpServletRequest.getParameterMap();

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        Method method = signature.getMethod();

        SystemControllerLog annotation = method.getAnnotation(SystemControllerLog.class);

        System.out.println("AfterReturning" + annotation.description());
    }
}
