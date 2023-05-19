package com.tikqa.web.model.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class TstResponse extends ResponseEntity {

    private String errorMessage;
    private String errorCode;


    public TstResponse(HttpStatus status) {
        super(status);
    }

    public TstResponse(Object body, HttpStatus status) {
        super(body, status);
    }

    public TstResponse(MultiValueMap headers, HttpStatus status) {
        super(headers, status);
    }

    public TstResponse(Object body, MultiValueMap headers, HttpStatus status) {
        super(body, headers, status);
    }

    public TstResponse(Object body, MultiValueMap headers, int rawStatus) {
        super(body, headers, rawStatus);
    }
}
