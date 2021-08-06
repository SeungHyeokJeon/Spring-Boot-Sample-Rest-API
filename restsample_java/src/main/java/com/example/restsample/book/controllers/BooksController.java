package com.example.restsample.book.controllers;

import com.example.restsample.book.dtos.BooksDTO;
import com.example.restsample.book.sevices.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BooksController {
    @Autowired
    BooksService booksService;

    // select one
    @GetMapping(path="/books/{id}", produces="application/json")
    public ResponseEntity<?> getBooksById(@PathVariable("id") Long id) {
        BooksDTO dto = booksService.findByID(id);
        if(dto!=null)
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        else
            return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
