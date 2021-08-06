package com.example.restsample.book.sevices;

import com.example.restsample.book.dtos.BooksDTO;

public interface BooksService {
//    public Page<BookDTO> findAll(Pageable pageable);
    public BooksDTO findByID(Long id);
}
