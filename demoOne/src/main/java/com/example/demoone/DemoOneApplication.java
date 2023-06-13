package com.example.demoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories
public class DemoOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoOneApplication.class, args);
        System.out.println("启动成功");
    }

}
