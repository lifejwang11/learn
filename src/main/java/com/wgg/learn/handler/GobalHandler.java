package com.wgg.learn.handler;

import com.wgg.learn.exception.UrlException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GobalHandler {

        @ExceptionHandler(UrlException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        public String test(){
            return "404";
        }
}
