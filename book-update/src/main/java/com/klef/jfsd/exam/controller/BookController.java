package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") Long bookId, @RequestBody Book updatedBook) {
        Optional<Book> result = bookService.updateBook(bookId, updatedBook);
        return result.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
