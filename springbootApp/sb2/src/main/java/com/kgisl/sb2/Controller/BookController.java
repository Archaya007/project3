package com.kgisl.sb2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.sb2.Entity.Book;
import com.kgisl.sb2.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
   

    @Autowired
    private BookRepository bookRepository;
    @GetMapping("/")
    public List<Book> getAllBooks()
    {
        bookRepository.findAll().forEach(System.out::println);
        return bookRepository.findAll();
    }
}
    

