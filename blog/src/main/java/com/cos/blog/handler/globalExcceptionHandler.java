package com.cos.blog.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class globalExcceptionHandler {
	@ExceptionHandler(value=Exception.class)
	public String handlerArgumentException(Exception e) {
		return "<h1>"+e.getMessage()+"</h1>";
	}
}
