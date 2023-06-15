package com.example.swaggerdemo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api")
public class BookController {

    ConcurrentMap<String, Book> books = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    @ApiOperation(value = "Finds books by id",
    notes = "Provides an id to look up specific book from the book store",
    response = Book.class)
    public Book getBook(@PathVariable String id) {
        return books.get(id);
    }

    @GetMapping("/")
    public List<Book> getAllBooks() {
        return new ArrayList<Book>(books.values());
    }

    @PostMapping("/")
    public Book addBook(@RequestBody Book book) {
        books.put(book.getId(), book);
        return book;
    }
}
