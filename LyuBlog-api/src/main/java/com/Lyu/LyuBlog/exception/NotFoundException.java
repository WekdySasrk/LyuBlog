package com.Lyu.LyuBlog.exception;


/**
*@ClassName: NotFoundException
*@Description: 404
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
public class NotFoundException extends RuntimeException{
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
