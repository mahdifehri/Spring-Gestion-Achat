package com.example.mahdifehri.services;

import java.util.List;

public interface GenericServiceInt<T,ID> {
    List<T> retrieveAll();
    void add(T t);
    void update(T t);
    void remove(ID id);
    T retrieve(ID id);
}
