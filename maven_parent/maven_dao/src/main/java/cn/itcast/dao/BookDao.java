package cn.itcast.dao;

import cn.itcast.domain.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from book")
    List<Book> findAll();
}
