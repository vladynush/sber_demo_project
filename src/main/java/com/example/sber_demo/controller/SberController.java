package com.example.sber_demo.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SberController {

    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public String showTestForm() {

        return "index";
    }


    @PostMapping("/api/sum")
    public ResponseEntity<Integer> sumOfNumbers(@RequestParam int num1, @RequestParam int num2) {
        System.out.println(num1 + num2);
        return new ResponseEntity<>(num1 + num2, HttpStatus.OK);
    }
}
