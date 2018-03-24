package com.chengxuk.controller;

import com.chengxuk.domain.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller    // This means that this class is a Controller
@RequestMapping(path="/course") // This means URL's start with /demo (after Application path)
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping(path="/all")
    public @ResponseBody ResponseEntity getAllCourses() {
        // This returns a JSON or XML with the courses
        return ResponseEntity.ok(courseRepository.findAll());
    }
    @GetMapping(path="/findById")
    public @ResponseBody ResponseEntity findById(@RequestParam Long id) {
        // This returns a JSON or XML with the courses
        return ResponseEntity.ok(courseRepository.findById(id));
    }
}