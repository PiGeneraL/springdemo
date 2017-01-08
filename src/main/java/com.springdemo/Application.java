package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * Created by pigeneral on 2017/1/5.
 */
@Configuration
@ComponentScan
public class Application {
    @Bean
    MessageService mockMessageService() {
        System.out.println("annotation config");
        return new MessageService() {
            public String getMessage() {
                return "Hello World!!";
            }
        };
    }


    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();


    }


}
