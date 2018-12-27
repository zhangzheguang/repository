package cn.itcast.service;

import cn.itcast.domain.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findById(int id);
}
