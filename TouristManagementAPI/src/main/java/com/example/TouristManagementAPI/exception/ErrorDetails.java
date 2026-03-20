package com.example.TouristManagementAPI.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

    public ErrorDetails(String statusCode, String msg, LocalDateTime dateTime) {
        this.statusCode = statusCode;
        this.msg = msg;
        this.dateTime = dateTime;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    private String statusCode;
    private String msg;
    private LocalDateTime dateTime;
}
