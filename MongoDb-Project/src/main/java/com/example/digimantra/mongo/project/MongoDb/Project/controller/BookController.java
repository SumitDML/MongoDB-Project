package com.example.digimantra.mongo.project.MongoDb.Project.controller;

import com.example.digimantra.mongo.project.MongoDb.Project.entity.Book;
import com.example.digimantra.mongo.project.MongoDb.Project.model.UpdateRequest;
import com.example.digimantra.mongo.project.MongoDb.Project.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/mongo")
@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book) {
        repository.save(book);
        return "Added book with id : " + book.getId();
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {
        return repository.findAll();
    }

    @GetMapping("/findAllBooks/{id}")
    public Object getBook(@PathVariable int id) {
        Book book =  repository.findById(id).orElse(null);
        if(book==null){
            return "Book Not Found!";
        }
        else {
            return book;
        }
    }

    @PutMapping("/updateBook/{id}")
    public String updateBook(@PathVariable Integer id,@RequestBody UpdateRequest request) {
        Book book = repository.findById(id).orElse(null);
        if(book==null){
            return "Book Not Found!";
        }
        book.setBookName(request.getBookName());
        book.setAuthorName(request.getAuthorName());
        repository.save(book);
        return "Book wit id : "+id+" updated!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        repository.deleteById(id);
        return "book deleted with id : " + id;
    }
}
