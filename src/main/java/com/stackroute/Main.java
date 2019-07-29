package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       // BeanLifeCycleDemoBean beanLifeCycleDemoBean=context.getBean("beanLifeCycle",BeanLifeCycleDemoBean.class);
        //System.out.println(beanLifeCycleDemoBean);
        context.registerShutdownHook();
        //Movie mov1=context.getBean("movie1",Movie.class);
//        Movie mov2=context.getBean("movie2",Movie.class);

//        System.out.println("checking test");
//        Actor act=context.getBean("actor",Actor.class);
//        System.out.println(act);
        //Movies class
//        Movie movies=context.getBean("movie",Movie.class);
//        System.out.println("movie class");
//        System.out.println(movies);

        //BeanDefinitionRegistry beanDefinitionRegistry= new BeanDefinitionRegistry("beans.xml")


//        //Bean Factory
//        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
//        Movie mov3=factory.getBean("movie2",Movie.class);
//        Movie mov4=factory.getBean("movie2",Movie.class);
//
       // System.out.println(mov1.getActor());
//        System.out.println(mov2.getActor());

//        System.out.println("testing bean factory");
//        Actor act1=context.getBean("actor",Actor.class);
//        System.out.println(act);
//        //Movies class
//        Movie movies1=context.getBean("movie",Movie.class);
//        System.out.println("movie class");
//        System.out.println(movies);

    }
}


/*
Exception in thread "main" org.springframework.beans.factory.BeanCreationException:
 Error creating bean with name 'movie2' defined in class path resource [BeanFile.xml]:
  Instantiation of bean failed; nested exception is org.springframework.beans.
  BeanInstantiationException: Failed to instantiate [com.stackroute.domain.Movie]:
  No default constructor found; nested exception is java.lang.NoSuchMethodException:
  com.stackroute.domain.Movie.<init>()

 */