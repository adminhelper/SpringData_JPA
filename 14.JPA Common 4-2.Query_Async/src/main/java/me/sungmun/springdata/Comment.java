package me.sungmun.springdata;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String commnet;

    @ManyToOne
    private Post post;

    private Date created;

    private Integer likeCount = 0;

    public Date getCreated () {
        return created;
    }

    public void setCreated (Date created) {
        this.created = created;
    }

    public Integer getLikeCount () {
        return likeCount;
    }

    public void setLikeCount (Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getCommnet () {
        return commnet;
    }

    public void setCommnet (String commnet) {
        this.commnet = commnet;
    }

    public Post getPost () {
        return post;
    }

    public void setPost (Post post) {
        this.post = post;
    }
}


