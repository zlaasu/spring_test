package org.zlasu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zlasu.beans.PersonService;

import java.util.List;

public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService personService = context.getBean(PersonService.class);

        List<String> allPersons = personService.getAllPersons();

        allPersons.forEach(System.out::println);
    }
}
