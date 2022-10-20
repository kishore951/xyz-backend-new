package com.nestdigital.xyzbackendnew.Controller;

import com.nestdigital.xyzbackendnew.Dao.StudentDao;
import com.nestdigital.xyzbackendnew.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/studententry",consumes = "application/json",produces = "application/json")
    public String studententry(@RequestBody StudentModel student){
        System.out.println(student.toString());
        dao.save(student);
        return "(status:'success')";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewStudent")
    public List<StudentModel> viewStudent(){
        return (List<StudentModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping("/deleteStudent")
    public String deleteStudent(@RequestBody StudentModel student){
        dao.deleteStudentById((student.getId()));
        return "{status:'success}";
    }

}
