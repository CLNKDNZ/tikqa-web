package com.tikqa.web.model.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class RestResponse<T> {
    HttpStatus httpStatus;
    private Boolean successful;
    private String errorCode;
    private String errorMessage;
    private T data;


    public static <T> RestResponse<T> fail(String errorCode, String errorMessage) {
        RestResponse<T> restResponse = new RestResponse<>();
        restResponse.setHttpStatus(HttpStatus.OK);
        restResponse.setSuccessful(false);
        restResponse.setErrorCode(errorCode);
        restResponse.setErrorMessage(errorMessage);
        return restResponse;
    }

    public static <T> RestResponse<T> success(T data) {
        RestResponse<T> restResponse = new RestResponse<T>();
        restResponse.setHttpStatus(HttpStatus.OK);
        restResponse.setSuccessful(true);
        restResponse.setData(data);
        return restResponse;
    }
}

