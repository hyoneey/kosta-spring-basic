package kosta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kosta.di.Factory;

public class Main {

	public static void main(String[] args){
		
		ApplicationContext factory = new GenericXmlApplicationContext("BoardContext.xml");
		
		Controller controller = (Controller)factory.getBean("controller");
		controller.in();
		
	}
	
	
}
