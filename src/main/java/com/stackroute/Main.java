package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
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
        System.out.println("checking test");
        Actor act=context.getBean("actor",Actor.class);
        System.out.println(act);
        //Movies class
        Movie movies=context.getBean("movie",Movie.class);
        System.out.println("movie class cocksfkjhdfjdfjkhdfkjhkjdsijfiugybyfhjerp9y");
        System.out.println(movies);



        //Bean Factory
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        System.out.println("testing bean factory");
        Actor act1=context.getBean("actor",Actor.class);
        System.out.println(act);
        //Movies class
        Movie movies1=context.getBean("movie",Movie.class);
        System.out.println("movie class");
        System.out.println(movies);

    }
}
