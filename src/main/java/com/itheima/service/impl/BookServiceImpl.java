package com.itheima.service.impl;

import com.itheima.mapper.BookMapper;
import com.itheima.pojo.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小空
 * @create 2022-05-06 10:52
 * @description
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> selectAllBook() {
        return bookMapper.selectAllBook();
    }

    public Book selectBookById(Integer id) {
        return bookMapper.selectBookById(id);
    }

    public boolean insertBook(Book book) {
        return bookMapper.insertBook(book);
    }

    public boolean deleteBook(Integer id) {
        return bookMapper.deleteBook(id);
    }

    public boolean updateBook(Book book) {
        return bookMapper.updateBook(book);
    }
}
