package me.sungmun.springdata.demo.post;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

@Configuration
class PostRepositoryTestConfig {

//    @Bean
//    public PostListener postListener(){
//        return new PostListener();
//    }
    @Bean
    public ApplicationListener<PostPublishedEvent> postListener(){
        return event -> {
            System.out.println("-------------------------");
            System.out.println(event.getPost() + " is Published");
            System.out.println("-------------------------");
        };
    }
}