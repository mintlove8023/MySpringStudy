package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.pojo.Book;
import com.itheima.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 小空
 * @create 2022-05-06 10:59
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SpringSSM_Test {

    @Autowired
    private BookService bookService;

    @Test
    public void selectAllBookTest() {
        List<Book> books = bookService.selectAllBook();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void insertBookTest() {
        System.out.println(bookService.insertBook(new Book(null, "市场营销", "直播5253", "好的直播平台")));
    }

}
