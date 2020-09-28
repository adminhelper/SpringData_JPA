package me.sungmun.springdata;

import javax.persistence.*;

@Entity
public class Study {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private Account owner;


}
