package com.gradletest.demogradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class test {

    @GetMapping("/hello")
    public String hi(){

        return "THIS IS MY FIRST GRADLE APPLICATION TEST. " +
                "GRADLE IS SIMILAR TO MAVEN, INSTEAD OF POM.XML HERE" +
                "WE HAE BUILD.GRADLE";
    }
}
//to run this localhost:8080/hello
//we can add dependencies in build.gradle