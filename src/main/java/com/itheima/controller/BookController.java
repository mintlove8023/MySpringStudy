package com.itheima.controller;

import com.itheima.pojo.Book;
import com.itheima.pojo.R;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 小空
 * @create 2022-05-06 10:54
 * @description Book控制层
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/selectAllBook")
    public R selectAllBook() {
        List<Book> books = bookService.selectAllBook();
        return R.success(books);
    }

    @GetMapping("/{id}")
    public R selectBookById(@PathVariable Integer id) {
        Book book = bookService.selectBookById(id);
        return R.success(book);
    }

    @PostMapping("/insertBook")
    public R insertBook(@RequestBody Book book) {
        bookService.insertBook(book);
        return R.success();
    }

    @DeleteMapping("/{id}")
    public R deleteBook(@PathVariable Integer id) {
        bookService.deleteBook(id);
        return R.success();
    }

    @PutMapping("/updateBook")
    public R updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
        return R.success();
    }
}
