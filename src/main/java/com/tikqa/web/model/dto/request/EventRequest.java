package com.tikqa.web.model.dto.request;

import com.automasi.nocodeautomation.enums.EventName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class EventRequest {

    private EventName name;
    private String description;
    private String type;
    private List<EventParamRequest> eventParam = new ArrayList<>();
}
