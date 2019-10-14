package com.test.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class AroundMethod implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("method name: "+invocation.getMethod().getName());
        System.out.println("method argument: "+invocation.getArguments());
        System.out.println("around method  ***  before");
        try {
            Object proceed = invocation.proceed();
            System.out.println("around *** after");
            return proceed;
        }catch(IllegalArgumentException e){
            System.out.println("around  ***   throws");
            throw e;
        }

    }
}
