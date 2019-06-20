package com.example.mahesh;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample
 */
@RestController
public class Sample {

    @GetMapping("/hello/{name}")
    public ResponseEntity<Test> sayHello(@PathVariable String name){
        Test t = new Test();
        t.setData(name);
        return new ResponseEntity<>(t, HttpStatus.OK);
      
    }
}