package hu.unideb.inf.springdatafx_cs10;

import hu.unideb.inf.springdatafx_cs10.model.Person;
import hu.unideb.inf.springdatafx_cs10.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataFxCs10Application implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataFxCs10Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Person person =  new Person();
        person.setName("Dávid");
        person.setDateOfBirth(LocalDate.of(2003,5,9));*/

        Person person = Person.builder()
                            .name("Jack")
                            .dateOfBirth(LocalDate.of(2004,11,12))
                        .build();

        personRepository.save(person);
    }
}
