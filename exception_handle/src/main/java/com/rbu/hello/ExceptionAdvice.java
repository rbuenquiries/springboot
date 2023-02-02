package com.rbu.hello;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<Message> arithmeticHandle(Exception exception) {
		Message message = new Message();
		message.setError(exception.getMessage());
		message.setStatus("400 Bad Request");
		message.setTimestamp(new Date());
		message.setPath("/cal");
		return new ResponseEntity<Message>(message, HttpStatus.BAD_REQUEST);
	}

}
