package com.mystudy.checkstyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CheckstyleApplication {

    @RequestMapping(
        "/"
    )
    String home() {
        return "Google Java CodeStyle";
    }

    public static void main(final String[] args) {
        SpringApplication.run(CheckstyleApplication.class, args);
    }

}
