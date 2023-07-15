package org.example.Mapping.Practice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JoinFormula;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String CourseTitle;
    private String CourseDescription;
    private String CourseDuration;

    @ManyToMany
    @JoinTable(name = "Course_Student", joinColumns = @JoinColumn(name = "fk_course_id"), inverseJoinColumns = @JoinColumn(name = "fk_student_id"))
    List<Student> studentList;
}
