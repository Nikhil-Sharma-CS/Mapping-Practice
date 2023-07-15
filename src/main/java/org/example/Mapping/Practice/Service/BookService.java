package org.example.Mapping.Practice.Service;

import org.example.Mapping.Practice.Model.Book;
import org.example.Mapping.Practice.Repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepo iBookRepo;

    public List<Book> getBooks() {
        return iBookRepo.findAll();
    }

    public String postBook(List<Book> books) {
        iBookRepo.saveAll(books);
        return "Books Saved";
    }

    public String deleteBook(Long id) {
        iBookRepo.deleteById(id);
        return "Book Deleted";
    }

    public String updateTitle(String title, Long id) {
        Book book = iBookRepo.findById(id).orElse(null);

        if(book != null)
        {
            book.setBookTitle(title);
            iBookRepo.save(book);
            return "Title updated";
        }

        return "Book not found";
    }
}
