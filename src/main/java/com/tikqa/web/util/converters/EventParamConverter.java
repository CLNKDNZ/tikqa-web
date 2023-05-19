package com.tikqa.web.util.converters;


import com.tikqa.web.model.dto.request.EventParamRequest;
import com.tikqa.web.model.dto.request.EventParamResponse;
import com.tikqa.web.model.entity.EventParam;
import lombok.AllArgsConstructor;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class EventParamConverter {
    private final ModelMapper modelMapper;

    public EventParam convertEventParamDTOToEntity(EventParamRequest eventParamRequest) {
        return modelMapper.map(eventParamRequest, EventParam.class);
    }

    public EventParamResponse convertEventParamEntityToResponse(EventParam eventParam) {
        return modelMapper.map(eventParam, EventParamResponse.class);
    }

    public List<EventParamResponse> convertEventParamEntityListToResponseList(List<EventParam> eventParamList) {
        return modelMapper.map(eventParamList, new TypeToken<List<EventParamResponse>>() {
        }.getType());
    }

    public EventParamResponse convertEventParamEntityToDTO(EventParam eventParam) {
        return modelMapper.map(eventParam, EventParamResponse.class);
    }
}
