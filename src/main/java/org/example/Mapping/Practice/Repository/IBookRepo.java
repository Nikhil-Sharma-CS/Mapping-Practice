package org.example.Mapping.Practice.Repository;

import org.example.Mapping.Practice.Model.Address;
import org.example.Mapping.Practice.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book, Long> {
}
