package com.business.gitpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeApplication {

    public static void main(String[] args) {SpringApplication.run(GitPracticeApplication.class, args);
        System.out.println("Hello World!");
        System.out.println("feature-A");
        System.out.println("feature-B 작업");
    }

}
