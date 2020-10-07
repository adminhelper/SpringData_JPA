package me.sungmun.springdata;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run (ApplicationArguments args) throws Exception {

        Session session = entityManager.unwrap(Session.class);
//        session.save(post);
//        Comment comment = session.get(Comment.class, 2l);
        Post post =session.get(Post.class, 1l);
        System.out.println("===========================");
//        System.out.println(comment.getPost().getTitle());
        System.out.println(post.getTitle());
        post.getComment().forEach(c ->{
            System.out.println("---------------------");
            System.out.println(c.getCommnet());
        });

//        session.delete(post);
    }
}
