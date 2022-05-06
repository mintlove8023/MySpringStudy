package com.itheima.controller;

import com.itheima.pojo.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 小空
 * @create 2022-05-06 14:19
 * @description
 */
@RestControllerAdvice
public class BookControllerException {
    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        return R.error("程序运行错误!");
    }
}
