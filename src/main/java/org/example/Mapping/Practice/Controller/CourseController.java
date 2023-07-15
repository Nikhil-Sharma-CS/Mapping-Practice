package org.example.Mapping.Practice.Controller;

import org.example.Mapping.Practice.Model.Course;
import org.example.Mapping.Practice.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("course")
    List<Course> getCourse()
    {
        return courseService.getCourse();
    }

    //Post course
    @PostMapping("course/{courses}")
    String postCourse(@RequestBody List<Course> courses)
    {
        return courseService.postCourse(courses);
    }

    //Delete course
    @DeleteMapping("course/{Id}")
    String deleteCourse(@PathVariable Long id)
    {
        return  courseService.deleteCourse(id);
    }

    @PutMapping("course/{duration}/{Id}")
    String updateTitle(@PathVariable String duration, @PathVariable Long Id)
    {
        return courseService.updateTitle(duration, Id);
    }
}
