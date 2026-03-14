package com.example.demo.exception;

public class DineroNegativo extends RuntimeException {
    public DineroNegativo(String message) {
        super(message);
    }
}
