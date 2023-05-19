package com.tikqa.web.model.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TestStepRequest {

    private Long eventOrder;
    private Long linkFrom;
    private Long linkTo;
    private String selectorTypeValue;
    private String eventParamValue;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private SelectorTypeRequest selectorType;
    private TestCaseEventRequest testCaseEvent;
}
