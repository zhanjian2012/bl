package com.bl.entity;

/**
 * Description: 响应类
 * Author：perkins
 * Date：2017/3/9
 */
public class Response<T> {

    final static int SUCCESS_STATUS = 200;
    final static int FAIL_STATUS = 500;
    private int status = SUCCESS_STATUS;
    private String info;
    private T data;

    public static Response Success() {
        Response response = new Response();
        response.status = SUCCESS_STATUS;
        return response;
    }

    public static Response Success(Object data) {
        Response response = Success();
        response.data = data;
        return response;
    }

    public static Response Success(Object data, String info) {
        Response response = Success(data);
        response.info = info;
        return response;
    }

    public static Response Fail() {
        Response response = new Response();
        response.status = FAIL_STATUS;
        return response;
    }

    public static Response Fail(Object data) {
        Response response = Fail();
        response.status = FAIL_STATUS;
        response.data = data;
        return response;
    }

    public static Response Fail(Object data, String info) {
        Response response = Fail(data);
        response.info = info;
        return response;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
