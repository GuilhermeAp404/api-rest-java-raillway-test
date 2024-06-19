package me.dio.lab.api_rest_railway.service;

import java.util.List;

public interface CrudService<T, ID> {
    List<T> listAll();
    T findById(ID id);
    T create(T t);
    T updateOne(ID id, T t);
    void deleteOne(ID id);
}
