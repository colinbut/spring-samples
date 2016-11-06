package com.mycompany.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot Application
 */
@SpringBootApplication
@RestController
public class Application {

    public static String HOME_DISPLAY_STRING = "I am at home!";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return HOME_DISPLAY_STRING;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
