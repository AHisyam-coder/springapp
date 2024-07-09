package com.hisyam.springboot.demo.mycoolapp.rest;

import com.hisyam.springboot.demo.mycoolapp.entity.StudentPOJO;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<StudentPOJO> theStudents;

    @PostConstruct
    public void loadDate() {
        theStudents = new ArrayList<>();

        theStudents.add(new StudentPOJO("Poornima", "ads"));
        theStudents.add(new StudentPOJO("gag", "qew"));
        theStudents.add(new StudentPOJO("xcz", "xzv"));
    }

    @GetMapping("/students")
    public List<StudentPOJO> getStudents() {
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public StudentPOJO getStudent(@PathVariable int studentId){

        if((studentId >= theStudents.size()) || (studentId < 0))
            throw new StudentNotFoundException("Std id not found " + studentId);

        return theStudents.get(studentId);
    }


}
