package com.tikqa.web.util.converters;


import com.tikqa.web.model.dto.request.TestCaseEventRequest;
import com.tikqa.web.model.dto.response.TestCaseEventResponse;
import com.tikqa.web.model.entity.TestCaseEvent;
import lombok.AllArgsConstructor;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TestCaseEventConverter {
    private final ModelMapper modelMapper;

    public TestCaseEvent convertTestCaseEventDTOToEntity(TestCaseEventRequest testCaseEventRequest) {
        return modelMapper.map(testCaseEventRequest, TestCaseEvent.class);
    }

    public TestCaseEventResponse convertTestCaseEventEntityToResponse(TestCaseEvent testCaseEvent) {
        return modelMapper.map(testCaseEvent, TestCaseEventResponse.class);
    }

    public List<TestCaseEventResponse> convertTestCaseEventEntityListToResponseList(List<TestCaseEvent> testCaseEvents) {
        return modelMapper.map(testCaseEvents, new TypeToken<List<TestCaseEventResponse>>() {
        }.getType());
    }

    public TestCaseEventResponse convertTestCaseEventEntityToDTO(TestCaseEvent testCaseEvent) {
        return modelMapper.map(testCaseEvent, TestCaseEventResponse.class);
    }
}
