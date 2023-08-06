package com.backend.ufc.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FighterExceptionHandler {

    @ExceptionHandler(value = ProductNotfoundException.class)
    public ResponseEntity<Object> exception(ProductNotfoundException exception) {
        return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> exception2(Exception exception) {
        return new ResponseEntity<>("Product not found222", HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = InvalidFighterCredentials.class)
    public ResponseEntity<Object> exception3(InvalidFighterCredentials exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

}