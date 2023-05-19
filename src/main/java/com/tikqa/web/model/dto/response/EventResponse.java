package com.tikqa.web.model.dto.response;

import com.tikqa.web.model.dto.EventDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EventResponse {
    private List<EventDTO> data;
    private String errorMessage;
    private String errorCode;
    private boolean isSuccessful;


}
