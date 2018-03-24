package com.chengxuk.controller;

import com.chengxuk.domain.entity.Evaluation;
import com.chengxuk.domain.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Controller    // This means that this class is a Controller
@RequestMapping(path="/evaluation") // This means URL's start with /demo (after Application path)
public class EvaluationController {
    @Autowired
    private EvaluationRepository evaluationRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody ResponseEntity addNewEvaluation (@RequestParam(required = false,defaultValue = "") String userName
            , @RequestParam String title,@RequestParam String courseName, @RequestParam String content) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Evaluation e = new Evaluation();
        e.setUseName(userName);
        e.setCourseName(courseName);
        e.setContent(content);
        e.setTitle(title);
        e.setSubDate(new Date());
        evaluationRepository.save(e);
        return ResponseEntity.ok("多谢兄台赏脸");
    }
    @GetMapping(path="/all")
    public @ResponseBody ResponseEntity findAllEvaluations() {
        // This returns a JSON or XML with the courses
        return ResponseEntity.ok(evaluationRepository.findAll());
    }
}