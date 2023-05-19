package com.tikqa.web.util.converters;


import com.tikqa.web.model.dto.request.TestStepRequest;
import com.tikqa.web.model.dto.response.TestStepResponse;
import com.tikqa.web.model.entity.TestStep;
import lombok.AllArgsConstructor;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TestStepConverter {
    private final ModelMapper modelMapper;

    public TestStep convertTestStepDTOToEntity(TestStepRequest testStepRequest) {

        return modelMapper.map(testStepRequest, TestStep.class);

    }

    public TestStepResponse convertTestStepEntityToResponse(TestStep testStep) {

        return modelMapper.map(testStep, TestStepResponse.class);
    }

    public List<TestStepResponse> convertTestStepEntityListToResponseList(List<TestStep> testSteps) {
        return modelMapper.map(testSteps, new TypeToken<List<TestStepResponse>>() {
        }.getType());

    }


    public TestStepResponse convertTestCaseEntityToDTO(TestStep testStep) {
        return modelMapper.map(testStep, TestStepResponse.class);
    }
}
