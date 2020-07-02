package net.seniorsteps.senior.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({"net.seniorsteps"})
//@EntityScan({"net.seniorsteps.senior.spring.dal.entity"})
public class SpringBootRestApplication {

    public static void main(String[] args) {
        System.out.println("Strating.......");
        SpringApplication.run(SpringBootRestApplication.class, args);
    }

}
