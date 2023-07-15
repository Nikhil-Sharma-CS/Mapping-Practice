package org.example.Mapping.Practice.Service;

import org.example.Mapping.Practice.Model.Student;
import org.example.Mapping.Practice.Repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;


    public List<Student> getStudent() {
        return iStudentRepo.findAll();
    }

    public String postStudent(List<Student> students) {
        iStudentRepo.saveAll(students);
        return "Students Saved";
    }

    public String deleteStudent(Long id) {
        iStudentRepo.deleteById(id);
        return "Student Deleted";
    }

    public String updateName(String name, Long id) {

        Student student = iStudentRepo.findById(id).orElse(null);

        if(student != null)
        {
            student.setStudentName(name);
            iStudentRepo.save(student);
            return "Name Updated";
        }

        return "Student Not Found";
    }
}
