package com.tikqa.web.model.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TestCaseEventRequest {
    private Long id;
    private String type;
    private EventName name;
    private String description;
    private List<EventParamRequest> eventParam;
}
