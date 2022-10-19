package com.nestdigital.xyzbackendnew.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/studententry")
    public String studententry(){
        return ( "Test");
    }
}
