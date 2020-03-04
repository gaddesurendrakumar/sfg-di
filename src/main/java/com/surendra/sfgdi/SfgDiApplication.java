package com.surendra.sfgdi;

import com.surendra.sfgdi.controllers.I18Controller;
import com.surendra.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
	ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);

		MyController myController =(MyController) ctx.getBean("myController");
		I18Controller i18Controller = (I18Controller) ctx.getBean("i18Controller");
		String greeting = i18Controller.sayHello();
		System.out.println("Greeting from Controller :" + greeting	);

	}

}
