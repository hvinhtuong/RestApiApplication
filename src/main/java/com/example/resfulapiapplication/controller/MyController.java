package com.example.resfulapiapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping(value ={"/hello-world", "/hello"}, method = RequestMethod.GET)
    public ResponseEntity helloworld() {
        User user = new User(01, "Bui Minh Bao Tran");
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(user);
    }
}
