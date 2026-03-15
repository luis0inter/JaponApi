package com.example.demo.exception;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ResourceBundle;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NoEncontrado.class)
    public ResponseEntity<String> handleNoEncontrado (NoEncontrado noEncontrado){
        return new ResponseEntity<>(noEncontrado.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(DineroNegativo.class)
    public ResponseEntity<String> handleDineroNegativo (DineroNegativo dineroNegativo){
        return new ResponseEntity<>(dineroNegativo.getMessage(),HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(ActividadesVacias.class) public ResponseEntity<String> handleActividadesVacias (ActividadesVacias actividadesVacias) {
        return new ResponseEntity<>(actividadesVacias.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ReviewsVacias.class) public ResponseEntity<String> handleReviewsVacias(ReviewsVacias reviewsVacias){
        return new ResponseEntity<>(reviewsVacias.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CampoVacio.class) public ResponseEntity<String> handleCampoVacio(CampoVacio campoVacio){
        return new ResponseEntity<>(campoVacio.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
