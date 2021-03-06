package com.surendra.sfgdi.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service
public class I18nEnglish implements GreetingService {
    @Override
    public String greeting() {
        return "Hello from English Service";
    }
}
