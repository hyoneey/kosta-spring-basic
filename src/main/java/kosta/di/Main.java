package kosta.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		/*
		Resource resource = new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);*/
		
		//지정한 위치를 참고하여 설정파일을 얻어옴
	/*	ApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");*/
		
		/* 자바 파일로 설정파일을 생성 */
		//ApplicationContext factory = new AnnotationConfigApplicationContext(Factory.class);
		
		
		String[] config = {
				"applicationContext.xml",
				"CommonContext.xml"
		};
		
		ApplicationContext factory = new ClassPathXmlApplicationContext(config);
				
				
	/*	Service service = (Service)factory.getBean("service");
		service.insert();*/
		
		Kosta kosta = (Kosta)factory.getBean("kosta");
		kosta.insert();

	}

}
