package org.example.Mapping.Practice.Controller;

import org.example.Mapping.Practice.Model.Address;
import org.example.Mapping.Practice.Model.Book;
import org.example.Mapping.Practice.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("book")
    List<Book> getBooks()
    {
        return bookService.getBooks();
    }

    //Post book
    @PostMapping("book/{books}")
    String postBook(@RequestBody List<Book> books)
    {
        return bookService.postBook(books);
    }

    //Delete book
    @DeleteMapping("book/{Id}")
    String deleteBook(@PathVariable Long id)
    {
        return  bookService.deleteBook(id);
    }

    @PutMapping("Book/{Title}/{Id}")
    String updateTitle(@PathVariable String Title, @PathVariable Long Id)
    {
        return bookService.updateTitle(Title, Id);
    }
}
