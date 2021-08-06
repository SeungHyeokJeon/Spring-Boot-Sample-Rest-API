package com.example.restsample.book.repositories;

import com.example.restsample.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
    public Optional<Books> findById(Long id);
    public List<Books> findByTitle(String title);
    public List<Books> findByAuthor(String author);
}
