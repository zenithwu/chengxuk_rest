package com.chengxuk.controller;

import com.chengxuk.domain.entity.Customer;
import com.chengxuk.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Controller    // This means that this class is a Controller
@RequestMapping(path="/customer") // This means URL's start with /demo (after Application path)
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody ResponseEntity addNewCustomer (@RequestParam(required = false,defaultValue = "") String name
            , @RequestParam String email, @RequestParam String phone
            ,@RequestParam String courseName, @RequestParam String question) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Customer c = new Customer();
        c.setName(name);
        c.setCourseName(courseName);
        c.setQuestion(question);
        c.setEmail(email);
        c.setPhone(phone);
        c.setSubDate(new Date());
        customerRepository.save(c);
        return ResponseEntity.ok("多谢兄台赏脸");
    }

    @GetMapping(path="/all")
    public @ResponseBody ResponseEntity findAllCustomers() {
        // This returns a JSON or XML with the users
        return ResponseEntity.ok(customerRepository.findAll());
    }
}