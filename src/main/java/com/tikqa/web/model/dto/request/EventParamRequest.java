package com.tikqa.web.model.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventParamRequest {
    private Long id;
    private String type;
    private String name;
}
