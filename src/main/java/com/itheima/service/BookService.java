package com.itheima.service;

import com.itheima.pojo.Book;

import java.util.List;

/**
 * @author 小空
 * @create 2022-05-06 10:51
 * @description
 */
public interface BookService {
    /**
     * 查询所有Book
     *
     * @return BookList
     */
    List<Book> selectAllBook();

    /**
     * 根据id查询Book
     *
     * @param id Book id
     * @return Book对象
     */
    Book selectBookById(Integer id);

    /**
     * 插入一个Book到数据库中
     *
     * @param book Book对象
     * @return [true 插入成功, false 插入失败]
     */
    boolean insertBook(Book book);

    /**
     * 根据id删除指定的Book
     *
     * @param id Book id
     * @return [true 删除成功, false 删除失败]
     */
    boolean deleteBook(Integer id);

    /**
     * 修改Book
     *
     * @param book Book对象
     * @return [true 修改成功, false 修改失败]
     */
    boolean updateBook(Book book);
}
