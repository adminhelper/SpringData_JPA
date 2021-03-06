package me.sungmun.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SungmunRegistrar.class)
public class SpringdataApplication {

    public static void main (String[] args) {
        SpringApplication.run(SpringdataApplication.class, args);
    }

}
