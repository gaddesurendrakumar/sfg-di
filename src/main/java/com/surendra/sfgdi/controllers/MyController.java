package com.surendra.sfgdi.controllers;

import com.surendra.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController( GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello(){
        System.out.println("Hello World");
        return  greetingService.greeting();
    }
}
