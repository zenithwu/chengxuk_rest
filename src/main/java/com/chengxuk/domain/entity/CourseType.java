package com.chengxuk.domain.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CourseType {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Course> getCourse() {
        return course;
    }

    public void setCourse(Set<Course> course) {
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String title;
    @OneToMany(mappedBy="type")
    private Set<Course> course = new HashSet<>();

}
