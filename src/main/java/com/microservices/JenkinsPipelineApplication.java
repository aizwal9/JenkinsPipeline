package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsPipelineApplication {

    @GetMapping
    public String message(){return "welcome to jenkins ci/cd projects";}

    public static void main(String[] args) {
        SpringApplication.run(JenkinsPipelineApplication.class,args);
    }
}
