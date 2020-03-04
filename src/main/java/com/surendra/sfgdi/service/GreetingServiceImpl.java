package com.surendra.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("II")
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello From service Impl222222";
    }
}
