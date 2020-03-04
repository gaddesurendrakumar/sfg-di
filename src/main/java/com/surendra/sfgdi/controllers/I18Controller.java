package com.surendra.sfgdi.controllers;

import com.surendra.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class I18Controller {

    private final GreetingService greetingService;

    public I18Controller(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello(){
        System.out.println("Hello World");
        return  greetingService.greeting();
    }
}
