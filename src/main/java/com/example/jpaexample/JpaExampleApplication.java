package com.example.jpaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaExampleApplication {

    public static void main(String[] args) {
        new SpringApplication(JpaExampleApplication.class).run(args);
    }


/*    @Override
    @Transactional
    public void run(String... args) throws Exception {

        List<Person> list = List.of(
                new Person("Ilya", "Ivanov", 20, "89652763456", "Moscow"),
                new Person("Ivan", "Petrov", 30, "89652766456", "SPB"),
                new Person("Alexey", "Gvozdev", 40, "89652766456", "MOSCOW"),
                new Person("Pavel", "Voronov", 50, "89652786456", "Kazan")
        );

        entityManager.persist(new Person("Oleg", "Fedorov", 36, "89652793456", "Moscow"));
        //list.forEach(person -> entityManager.persist(person));

    }*/

}
