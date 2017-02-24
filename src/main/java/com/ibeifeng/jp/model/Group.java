package com.ibeifeng.jp.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by zmzy on 2017/2/16.
 */
@Entity
@Table(name = "t_group")
public class Group {
    public Group(){}

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    @Id
    @GenericGenerator(name = "mid",strategy = "native")
    @GeneratedValue(generator = "mid")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
