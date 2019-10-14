package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringAOPAdvice.xml");
        CustomerService customerBean = (CustomerService) context.getBean("customerServiceProxy");
        System.out.println("使用Spring AOP 如下");
        customerBean.printName();
        System.out.println("---------------");
        customerBean.printURL();
        System.out.println("---------------");
        try {
            customerBean.printThrowException();
        } catch(Exception e) {
            //e.printStackTrace();
        }
        }

    }

