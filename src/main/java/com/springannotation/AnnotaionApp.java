package com.springannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * Created by pigeneral on 2017/1/12.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ComponentScan(basePackages = "com.springannotation")
@ContextConfiguration
public class AnnotaionApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springannotation");
        System.out.println("beans:" + Arrays.toString(context.getBeanDefinitionNames()));
        Zoro zoro = (Zoro) context.getBean("zoro");
        zoro.useAxe();

        Sanji sanji = context.getBean("sanji", Sanji.class);
        sanji.useAxe();
    }

    /*@Resource
    private Zoro zoro;

    @Test
    public void testAnnotation(){
        zoro.useAxe();
    }*/

}
