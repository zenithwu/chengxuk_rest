package com.chengxuk.domain.vo;

import com.chengxuk.domain.entity.CourseType;

public class CourseTypeVO {

    public CourseTypeVO(){

    }
    public CourseTypeVO(CourseType ct){
        this.id=ct.getId();
        this.name=ct.getName();
        this.title=ct.getTitle();
    }

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
    public Integer getJoinNum() {
        return joinNum;
    }

    public void setJoinNum(Integer joinNum) {
        this.joinNum = joinNum;
    }

    public Integer getFavNum() {
        return favNum;
    }

    public void setFavNum(Integer favNum) {
        this.favNum = favNum;
    }

    public Integer getWorkNum() {
        return workNum;
    }

    public void setWorkNum(Integer workNum) {
        this.workNum = workNum;
    }

    private Integer id;
    private String name;
    private String title;
    private Integer joinNum;
    private Integer favNum;
    //就业任务
    private Integer workNum;



}
