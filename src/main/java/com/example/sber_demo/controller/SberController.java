package com.example.sber_demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@Controller
public class SberController {


    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public String showTestForm() {

        return "index";
    }

    @PostMapping("/post")
    public ResponseEntity<Integer> sumOfNumbers(@RequestParam int num1, @RequestParam int num2) {
        System.out.println(num1 + num2);
        return new ResponseEntity<>(num1 + num2, HttpStatus.OK);
    }
}
