package com.chengxuk.controller;

import com.chengxuk.domain.entity.Course;
import com.chengxuk.domain.entity.CourseType;
import com.chengxuk.domain.repository.CourseRepository;
import com.chengxuk.domain.repository.CourseTypeRepository;
import com.chengxuk.domain.vo.CourseTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller    // This means that this class is a Controller
@RequestMapping(path="/course_type") // This means URL's start with /demo (after Application path)
public class CourseTypeController {
    @Autowired
    private CourseTypeRepository courseTypeRepository;
    @Autowired
    private CourseRepository courseRepository;


    @GetMapping(path="/all")
    public @ResponseBody ResponseEntity getAllCourseTypes() {
        // This returns a JSON or XML with the courses
        return ResponseEntity.ok(courseTypeRepository.findAll());
    }
    @GetMapping(path="/findById")
    public @ResponseBody ResponseEntity findById(@RequestParam Long id) {
        // This returns a JSON or XML with the courses
        return ResponseEntity.ok(courseTypeRepository.findById(id));
    }
    @GetMapping(path="/findAllCountNum")
    public @ResponseBody ResponseEntity findAllCountNum() {
        List<CourseTypeVO> list= new ArrayList<>();
        for (CourseType ct:courseTypeRepository.findAll()
                ) {
            Integer joinNum=0;
            Integer favNum=0;
            Integer workNum=0;
            for (Course c:courseRepository.findAll()
                    ) {
                joinNum+=c.getJoinNum();
                favNum+=c.getFavNum();
                workNum+=c.getWorkNum();
            }
            CourseTypeVO cto=new CourseTypeVO(ct);
            cto.setFavNum(favNum);
            cto.setJoinNum(joinNum);
            cto.setWorkNum(workNum);
            list.add(cto);
        }
        return ResponseEntity.ok(list);
    }
}