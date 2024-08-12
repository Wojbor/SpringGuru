package amaciag.springframework.springGuru;

import amaciag.springframework.springGuru.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringGuruApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringGuruApplication.class, args);

		MyController myController = context.getBean(MyController.class);

		System.out.println("I'm in the Main");


		System.out.println(myController.sayHello());
	}

}
