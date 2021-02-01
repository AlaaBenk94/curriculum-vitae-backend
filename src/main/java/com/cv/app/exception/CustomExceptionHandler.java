package com.cv.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = {ElementNotFoundException.class})
    public ResponseEntity handleException(ElementNotFoundException e) {
        return new ResponseEntity("Oooops we can't find your element", HttpStatus.NOT_FOUND);
    }


}
