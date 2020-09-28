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
    }
}
