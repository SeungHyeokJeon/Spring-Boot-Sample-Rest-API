package com.example.restsample.book.mappers;

public interface EntityMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);
}
