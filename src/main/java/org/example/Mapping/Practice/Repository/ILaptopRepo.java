package org.example.Mapping.Practice.Repository;

import org.example.Mapping.Practice.Model.Address;
import org.example.Mapping.Practice.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop, Long> {
}
