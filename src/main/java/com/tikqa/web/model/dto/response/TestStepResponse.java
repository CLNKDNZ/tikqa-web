package com.tikqa.web.model.dto.response;

import com.tikqa.web.model.dto.request.SelectorTypeResponse;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TestStepResponse {

    private Long eventOrder;
    private Long linkFrom;
    private Long linkTo;
    private String selectorTypeValue;
    private String eventParamValue;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private SelectorTypeResponse selectorType;
    private TestCaseEventResponse testCaseEvent;
}
