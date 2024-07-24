package me.dio.service;

import java.util.Set;

public interface CrudService<ID, T> {
    Set<T> findAll();
    T findById(ID id);
    T create(T entity);
    T update(ID id, T entity);
    void delete(ID id);
}
