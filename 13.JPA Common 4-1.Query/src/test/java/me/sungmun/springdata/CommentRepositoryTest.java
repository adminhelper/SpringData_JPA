package me.sungmun.springdata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Test
    public void crud() {

        this.createComment(100,"spring data jpa");
        this.createComment(55,"hibernate spring");

        PageRequest pageRequest = PageRequest.of(0,10, Sort.by(Sort.Direction.DESC,"LikeCount"));

//        List<Comment> comments = commentRepository.findByCommnetContainsIgnoreCase("Spring", pageRequest);
//        Page<Comment> comments = commentRepository.findByCommnetContainsIgnoreCase("Spring", pageRequest);
        try(Stream<Comment> comments = commentRepository.findByCommnetContainsIgnoreCase("Spring", pageRequest)){
            Comment firstComment = comments.findFirst().get();
            assertThat(firstComment.getLikeCount()).isEqualTo(100);
        }
//        assertThat(comments.getNumberOfElements()).isEqualTo(2);
//        assertThat(comments).first().hasFieldOrPropertyWithValue("likeCount", 100);
    }

    private void createComment (int likeCount,String comment) {
        Comment newComment = new Comment();
        newComment.setLikeCount(likeCount);
        newComment.setCommnet(comment);
        commentRepository.save(newComment);
    }
}