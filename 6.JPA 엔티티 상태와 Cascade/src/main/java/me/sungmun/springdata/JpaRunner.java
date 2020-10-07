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
        Account account = new Account();
        account.setUsername("jiji");
        account.setPassword("hibernate");

        Study study = new Study();
        study.setName("sungmun");
//        study.setOwner(account);

        // 메소드로 묶어서 표현
        account.addStudy(study);



        Session session = entityManager.unwrap(Session.class);
        session.save(account);
        session.save(study);
//        entityManager.persist(account);
        Account sungmun = session.load(Account.class, account.getId());
        System.out.println("====================");
        System.out.println(sungmun.getUsername());


//        Post post = new Post();
//        post.setTitle("Spring Data Jpa 언제하나..");
//
//        Comment comment = new Comment();
//        comment.setCommnet("대박");
//        post.addCommnet(comment);
//
//        Comment comment1 = new Comment();
//        comment1.setCommnet("짱짱");
//        post.addCommnet(comment1);

//        Session session = entityManager.unwrap(Session.class);
//        session.save(post);
//
//        Post post = session.get(Post.class, 1l);
//        session.delete(post);
    }
}
