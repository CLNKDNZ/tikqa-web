package com.tikqa.web.util.converters;


import com.tikqa.web.model.dto.request.EventRequest;
import com.tikqa.web.model.dto.response.EventResponse;
import com.tikqa.web.model.entity.TestCaseEvent;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EventConverter {
    private final ModelMapper modelMapper;

    public TestCaseEvent convertEventDTOToEntity(EventRequest eventRequest) {
        return modelMapper.map(eventRequest, TestCaseEvent.class);
    }

    public EventResponse convertEventEntityToDTO(TestCaseEvent testCaseEvent) {
        return modelMapper.map(testCaseEvent, EventResponse.class);
    }
}
