package com.example.Toystore.exception;

public class PurchaseNotFoundException extends RuntimeException {
    public PurchaseNotFoundException(Long id) {
        super("Purchase not found with id: " + id);
    }
}
