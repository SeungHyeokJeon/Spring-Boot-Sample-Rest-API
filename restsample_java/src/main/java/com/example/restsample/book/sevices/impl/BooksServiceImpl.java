package com.example.restsample.book.sevices.impl;

import com.example.restsample.book.dtos.BooksDTO;
import com.example.restsample.book.mappers.BooksMapper;
import com.example.restsample.book.repositories.BooksRepository;
import com.example.restsample.book.sevices.BooksService;
import com.example.restsample.entities.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksRepository booksRepository;
    private BooksMapper booksMapper;

    // select all
//    @Override
//    public Page<Book> findAll(Pageable pageable) {
//        // 한 번에 몇개의 페이지를 조회할 것인지 설정
//        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() -1, 10, Sort.by(Sort.Direction.DESC, "id"));
//
//        Page<Book> entity = booksRepository.findAll(pageable);
//
//        return new PageImpl<>()
//    }

    // select one
    @Override
    public BooksDTO findByID(Long id) {
        Optional<Books> entity = booksRepository.findById(id);
        BooksDTO dto;
        if(entity.isPresent()) {
            dto = booksMapper.toDto(entity.get());
            return dto;
        } else {
            return null;
        }
    }
}
