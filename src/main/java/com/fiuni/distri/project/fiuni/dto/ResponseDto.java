package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class ResponseDto<T> implements Serializable {

    private int httpStatus;
    private boolean success;
    private String message;
    private T data;
    private String[] errors;
    private String timeStamp;

    public ResponseDto(int httpStatus, String message, T data ){
        this.httpStatus = httpStatus;
        this.success = true;
        this.message = message;
        this.data = data;
        this.errors = null;
        this.timeStamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public ResponseDto(int httpStatus, String message, String[] errors) {
        this.httpStatus = httpStatus;
        this.success = false;
        this.message = message;
        this.data = null;
        this.errors = errors;
        this.timeStamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
    }

}
