package com.example.restsample.book.repositories.custom.impl;

import com.example.restsample.book.repositories.custom.BooksRepositoryCustom;
import com.example.restsample.entities.Books;
import com.example.restsample.entities.QBooks;
import com.querydsl.core.BooleanBuilder;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;
import java.util.Objects;

public class BooksRepositoryCustomImpl extends QuerydslRepositorySupport implements BooksRepositoryCustom {
    public BooksRepositoryCustomImpl() {
        super(Books.class);
    }

    @Override
    public List<Books> searchBooks(Books entity, Pageable pageable) {
        QBooks books = QBooks.books;

        BooleanBuilder booleanBuilder = new BooleanBuilder();
        if(entity.getTitle() != null) {
            booleanBuilder.and(books.title.like("%"+entity.getTitle()+"%"));
        }
        if(entity.getAuthor()!=null) {
            booleanBuilder.and(books.author.like("%"+entity.getAuthor()+"%"));
        }

        return Objects.requireNonNull(getQuerydsl()).applyPagination(pageable, from(books)).where(booleanBuilder).fetch();
    }
}
