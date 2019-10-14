package com.test.spring;

import org.springframework.aop.ThrowsAdvice;

public class ThrowExceptionMethod implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Throwable{
        System.out.println("throw exception method");
    }
}
