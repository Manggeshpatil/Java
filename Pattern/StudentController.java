package org.jspider.RestApiArchitecture_Demo3_database.Controller;

import org.jspider.RestApiArchitecture_Demo3_database.Domain.Student;
import org.jspider.RestApiArchitecture_Demo3_database.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {
    @Autowired
    private StudentService service;
    //Add students
    @PostMapping("/students")
    public void addNewStudent(@RequestBody Student s){
        service.addNewStudent(s);
    }


    //Display all student
    @GetMapping("/students")
    public List<Student> getAllstudent(){
        return service.getAllStudent();
    }

    //Display student by id
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable(value = "id")int id){
        return service.getStudentById(id);
    }

    //get student by name      all details
    @GetMapping("/sname/{name}")
    public  List<Student> getStudentByName(@PathVariable(value = "name") String name){
        return  service.getStudentByName(name);
    }

    //get student by stream    only name
    @GetMapping("/sstream/{stream}")
    public  List<String>getStudentByStream(@PathVariable(value = "stream")String stream){
        return  service.getStudentByStream(stream);
    }

    //get student by course    all details
    @GetMapping("/scourse/{course}")
    public  List<Student>getStudentByCourse(@PathVariable(value = "course")String course){
        return  service.getStudentByCourse(course);
    }
    // update student details id
    @PutMapping("/studentd/{id}")
    public void  updateStudent(@PathVariable(value = "id")int id,@RequestBody Student c){
        service.updateStudent(id,c);
    }

    // delete student by id
    @DeleteMapping("/studentid/{id}")
    public void deleteStudentById(@PathVariable(value = "id")int id){
        service.deleteStudenBytId(id);
    }

    //delete student by course
    @DeleteMapping("/studentcourse/{course}")
    public void deleteStudentByCourse(@PathVariable(value = "course")String c){
        service.deleteStudentByCourse(c);
    }

}
