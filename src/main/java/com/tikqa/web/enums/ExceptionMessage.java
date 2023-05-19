package com.tikqa.web.enums;

public enum ExceptionMessage {

    DATA_NOT_EXIST_EXCEPTION_MESSAGE("Data not found...");

    public final String errorMessage;


    ExceptionMessage(String errorMessage) {
        this.errorMessage = errorMessage;


    }
}
