package pl.polsl.danieljeankinsheroku1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Danieljeankinsheroku1Application {

    public static void main(String[] args) {
        SpringApplication.run(Danieljeankinsheroku1Application.class, args);
    }

    @GetMapping
    public String get(){
        return "Hello Jenkins";
    }

}
