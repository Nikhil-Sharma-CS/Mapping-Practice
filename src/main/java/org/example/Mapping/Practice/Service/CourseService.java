package org.example.Mapping.Practice.Service;

import org.example.Mapping.Practice.Model.Course;
import org.example.Mapping.Practice.Repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo iCourseRepo;

    public List<Course> getCourse() {
        return iCourseRepo.findAll();
    }

    public String postCourse(List<Course> courses) {
        iCourseRepo.saveAll(courses);
        return "Courses Saved";
    }

    public String deleteCourse(Long id) {
        iCourseRepo.deleteById(id);
        return "Course Deleted";
    }

    public String updateTitle(String duration, Long id) {

        Course course = iCourseRepo.findById(id).orElse(null);

        if(course != null)
        {
            course.setCourseDuration(duration);
            iCourseRepo.save(course);
        }
        return "Course not found";
    }
}
