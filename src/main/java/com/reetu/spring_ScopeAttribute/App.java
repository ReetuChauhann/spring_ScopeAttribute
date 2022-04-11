package com.reetu.spring_ScopeAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		com.reetu.beans.Employee e=(com.reetu.beans.Employee)ctx.getBean("employee");
		//com.reetu.beans.Employee e=ctx.getBean("employee",com.reetu.beans.Employee.class);
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getCname());
		System.out.println(e.getAge());
		e.setName("Yoyo Gupta");
		com.reetu.beans.Employee e2=(com.reetu.beans.Employee)ctx.getBean("employee");
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
		System.out.println(e2.getCname());
		System.out.println(e2.getAge());
		
    }
}

