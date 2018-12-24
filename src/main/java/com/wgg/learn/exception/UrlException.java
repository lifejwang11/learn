package com.wgg.learn.exception;

/**
 *
 * @author life
 * @date 2018.12.23
 */
public class UrlException extends RuntimeException{

    public UrlException(String message){
        message=super.getMessage();
    }


}
