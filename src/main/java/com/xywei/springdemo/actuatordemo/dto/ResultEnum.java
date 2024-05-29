package com.xywei.springdemo.actuatordemo.dto;

public enum ResultEnum {
    SUCCESS(200, "success"),
    FAILURE(400, "failure"),
    EMPTY(201, "no data");

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
