package com.example.restsample.book.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BooksDTO {
    private Long id;
    private String title;
    private String author;
}
