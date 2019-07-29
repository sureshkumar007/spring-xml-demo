package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
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
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie mov1=context.getBean("movie1",Movie.class);
        Movie mov2=context.getBean("movie2",Movie.class);
//        System.out.println("checking test");
//        Actor act=context.getBean("actor",Actor.class);
//        System.out.println(act);
        //Movies class
//        Movie movies=context.getBean("movie",Movie.class);
//        System.out.println("movie class");
//        System.out.println(movies);

        //BeanDefinitionRegistry beanDefinitionRegistry= new BeanDefinitionRegistry("beans.xml")


//        //Bean Factory
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        Movie mov3=context.getBean("movie2",Movie.class);
        Movie mov4=context.getBean("movie2",Movie.class);
        System.out.println(mov1==mov3);
        System.out.println(mov1.getActor());
        System.out.println(mov3.getActor());

//        System.out.println("testing bean factory");
//        Actor act1=context.getBean("actor",Actor.class);
//        System.out.println(act);
//        //Movies class
//        Movie movies1=context.getBean("movie",Movie.class);
//        System.out.println("movie class");
//        System.out.println(movies);

    }
}
