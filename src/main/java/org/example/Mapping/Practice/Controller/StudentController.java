package org.example.Mapping.Practice.Controller;

import org.example.Mapping.Practice.Model.Student;
import org.example.Mapping.Practice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("student")
    List<Student> getStudent()
    {
        return studentService.getStudent();
    }

    //Post student
    @PostMapping("student/{students}")
    String postStudent(@RequestBody List<Student> students)
    {
        return studentService.postStudent(students);
    }

    //Delete student
    @DeleteMapping("student/{Id}")
    String deleteStudent(@PathVariable Long id)
    {
        return  studentService.deleteStudent(id);
    }

    @PutMapping("student/{name}/{Id}")
    String updateName(@PathVariable String name , @PathVariable Long Id)
    {
        return studentService.updateName(name , Id);
    }
}
