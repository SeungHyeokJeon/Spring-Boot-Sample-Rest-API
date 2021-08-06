package com.example.restsample.book.repositories.custom;

import com.example.restsample.entities.Books;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BooksRepositoryCustom {
    public List<Books> searchBooks(Books entity, Pageable pageable);
}
