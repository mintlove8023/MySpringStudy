package com.itheima.mapper;

import com.itheima.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author 小空
 * @create 2022-05-06 10:45
 * @description Book持久层
 */
public interface BookMapper {
    /**
     * 查询所有Book
     *
     * @return BookList
     */
    @Select("select * from tb_book")
    List<Book> selectAllBook();

    /**
     * 根据id查询Book
     *
     * @param id Book id
     * @return Book对象
     */
    @Select("select * from tb_book where id=#{id}")
    Book selectBookById(Integer id);

    /**
     * 插入一个Book到数据库中
     *
     * @param book Book对象
     * @return [true 插入成功, false 插入失败]
     */
    @Insert("insert into tb_book values (null,#{type},#{name},#{description})")
    boolean insertBook(Book book);

    /**
     * 根据id删除指定的Book
     *
     * @param id Book id
     * @return [true 删除成功, false 删除失败]
     */
    @Delete("delete from tb_book where id=#{id}")
    boolean deleteBook(Integer id);

    /**
     * 修改Book
     *
     * @param book Book对象
     * @return [true 修改成功, false 修改失败]
     */
    @Update("update tb_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    boolean updateBook(Book book);
}
