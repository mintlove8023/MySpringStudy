package com.itheima.pojo;

/**
 * @author 小空
 * @create 2022-05-06 11:47
 * @description
 */
public class R {
    private Object data;
    private Boolean flag;
    private String str;

    public R() {
    }

    public R(Object data, Boolean flag) {
        this.data = data;
        this.flag = flag;
    }

    public R(Object data, Boolean flag, String str) {
        this.data = data;
        this.flag = flag;
        this.str = str;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static R error(String str) {
        return new R(null, Boolean.FALSE, str);
    }

    public static R success() {
        return new R(null, Boolean.TRUE, null);
    }

    public static R success(Object data) {
        return new R(data, Boolean.TRUE, null);
    }
}
