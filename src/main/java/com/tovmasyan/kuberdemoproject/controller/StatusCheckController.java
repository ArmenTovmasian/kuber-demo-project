package com.tovmasyan.kuberdemoproject.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/checkStatus")
public class StatusCheckController {


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void checkStatus(){}
}
