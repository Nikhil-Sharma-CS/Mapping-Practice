package org.example.Mapping.Practice.Repository;

import org.example.Mapping.Practice.Model.Address;
import org.example.Mapping.Practice.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, Long> {
}
