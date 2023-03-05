package com.example.TestJenkin;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJenkinsController {
    @RequestMapping(value = "/api/jenkin/test")
    public ResponseEntity<?> testJenkin(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello world");
    }
}
