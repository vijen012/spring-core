package com.springcore.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class GreetingApp {

	public static void main(String[] args) {
/*		// Creating the application context(Container) using FileSystemXmlApplicationContext
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
				
		//Create the bean
		Greeting greeting = (Greeting) context.getBean("greeting");
		
		//Invoke the method using bean
		greeting.greet("Hello, How are you");
		
		//close the application context (Container)
		((FileSystemXmlApplicationContext) context).close();*/
		
		
		// Creating the application context(Container) using ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		//Create the bean
		Greeting greeting = (Greeting) context.getBean("greeting");
		
		//Invoke the method using bean
		greeting.greet("Hello, How are you");
		
		//close the application context (Container)
		((ClassPathXmlApplicationContext) context).close();

	}

}
