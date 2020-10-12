package me.sungmun.springdata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Test
    public void crud() {
        commentRepository.save(null);

//        List<Comment> comments  = commentRepository.findAll();
//        assertThat(comments).isEmpty();

//        Optional<Comment> byId = commentRepository.findById(100l);
//        assertThat(byId).isEmpty();
//        Comment comment = byId.orElse(new Comment());
//        Comment comment = byId.orElseThrow(IllegalArgumentException::new);

//          비추 요즘 추세는 optional
//        Comment comment = commentRepository.findById(100l);
//        if(comment == null){
//            throw  new IllegalArgumentException();
//        }

    }
}