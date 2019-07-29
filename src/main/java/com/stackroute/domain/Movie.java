package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//public class Movie
//{
//    private Actor actor;
//
////    public Movie() {
////
////    }
//
//
//    public Movie(Actor actor)
//    {
//        this.actor = actor;
//    }
//
//    public Actor getActor() {
//        return actor;
//    }
//
//    public void setActor(Actor actor) {
//        this.actor = actor;
//        System.out.println("called");
//    }
//
//    @Override
//    public String toString() {
//        return "Movie{" +
//                "actor=" + actor +
//                '}';
//    }
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
{
    Actor actor;
    private ApplicationContext applicationContext = null;
    private BeanFactory beanFactory;

    //use setter injection in task1
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
    public Movie() {
        super();
    }

    //use constructor-injection in task2
    public Movie(Actor actor) {
        this.actor = actor;
    }
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
    public void setBeanName(String s) {
        System.out.println(s);
    }
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

}
