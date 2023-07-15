package org.example.Mapping.Practice.Repository;

import org.example.Mapping.Practice.Model.Address;
import org.example.Mapping.Practice.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course, Long> {
}
