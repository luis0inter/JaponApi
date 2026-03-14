package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NoEncontrado.class)
    public ResponseEntity<String> handleNoEncontrado (NoEncontrado noEncontrado){
        return new ResponseEntity<>(noEncontrado.getMessage(), HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<String> handleDineroNegativo (DineroNegativo dineroNegativo){
        return new ResponseEntity<>("No se puede poner dinero negativo",HttpStatus.BAD_REQUEST);
    }
}
