package IoC.Container.Annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IoCContainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);


	}

}
