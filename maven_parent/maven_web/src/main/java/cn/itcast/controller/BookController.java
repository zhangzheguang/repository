package cn.itcast.controller;

import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

     @RequestMapping("/findAll")
    public String  findAll(){
        return "hello world";
    }
}
