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
    public ModelAndView findAll(){
        System.out.println(123);
        List<Book> all = bookService.findAll();

        ModelAndView modelAndView = new ModelAndView("success");

        modelAndView.addObject("list", all);
        System.out.println(123);
        return modelAndView;
    }
}
