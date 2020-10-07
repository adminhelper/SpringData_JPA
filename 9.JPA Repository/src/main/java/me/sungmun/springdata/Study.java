package me.sungmun.springdata;

import javax.persistence.*;

@Entity
public class Study {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne // 기본값은 FK생성
    private Account owner;

    public Account getOwner () {
        return owner;
    }

    public void setOwner (Account owner) {
        this.owner = owner;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

//    public Account getOwner () {
//        return owner;
//    }
//
//    public void setOwner (Account owner) {
//        this.owner = owner;
//    }
}
