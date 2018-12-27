package cn.itcast.service.impl;


import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;
    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Book findById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {
        System.out.println("已删除");
    }


}
