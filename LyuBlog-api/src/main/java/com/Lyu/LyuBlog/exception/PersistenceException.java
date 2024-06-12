package com.Lyu.LyuBlog.exception;


/**
*@ClassName: PersistenceException
*@Description: 持久化异常
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
public class PersistenceException extends RuntimeException
{
    public PersistenceException() {
    }

    public PersistenceException(String message) {
        super(message);
    }

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

}
