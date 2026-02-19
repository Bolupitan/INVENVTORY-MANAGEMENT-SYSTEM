package com.stockhub.InventoryManagementSystem.adapters;

public class HttpResponse<T> {

    private boolean success;
    private String message;
    private T data;

    // parameterized constructor
    public HttpResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
}
