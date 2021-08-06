package com.example.restsample.book.mappers;

import java.util.List;

public interface EntityMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);
    List<D> toDtoList(List<E> entityList);
    List<E> toEntityList(List<D> dtoList);
}
