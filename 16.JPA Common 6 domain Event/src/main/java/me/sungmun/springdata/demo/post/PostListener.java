package me.sungmun.springdata.demo.post;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

//public class PostListener implements ApplicationListener<PostPublishedEvent> {
public class PostListener {
//Bean으로 등록해서 PostListener Class는 필요가없다
    @EventListener
    public void onApplicationEvent (PostPublishedEvent event) {
        System.out.println("-------------------------");
        System.out.println(event.getPost() + " is Published");
        System.out.println("-------------------------");
    }
}
