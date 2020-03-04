package com.surendra.sfgdi.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("KA")
@Service
public class I18nKannada implements GreetingService {
    @Override
    public String greeting() {
        return "Namaskara from kannada";
    }
}
