package me.sungmun.springdata.demo.post;

import me.sungmun.springdata.demo.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long> {
}
