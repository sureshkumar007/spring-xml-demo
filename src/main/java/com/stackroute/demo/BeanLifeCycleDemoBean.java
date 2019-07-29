package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean,DisposableBean
{


    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
    public void customInit()
    {
        System.out.println("custome init");
    }
    public void customDestroy()
    {
        System.out.println("destroy ");
    }
}
