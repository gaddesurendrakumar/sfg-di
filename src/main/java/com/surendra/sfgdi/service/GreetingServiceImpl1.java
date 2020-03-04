package com.surendra.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("III")
@Service
public class GreetingServiceImpl1 implements GreetingService {
    @Override
    public String greeting() {
        return "Hello From service Impl1111";
    }
}
