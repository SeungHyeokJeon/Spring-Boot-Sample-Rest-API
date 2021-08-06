package com.example.restsample.book.mappers;

import com.example.restsample.book.dtos.BooksDTO;
import com.example.restsample.entities.Books;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BooksMapper extends EntityMapper<BooksDTO, Books>{
}
