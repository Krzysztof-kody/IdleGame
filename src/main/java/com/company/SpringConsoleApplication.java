package com.company;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringConsoleApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringConsoleApplication.class).headless(false).run(args);
    }


}
