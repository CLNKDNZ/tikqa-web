package com.tikqa.web.util.converters;


import com.tikqa.web.model.dto.request.TestCaseRequest;
import com.tikqa.web.model.dto.response.TestCaseResponse;
import com.tikqa.web.model.entity.EventParam;
import com.tikqa.web.model.entity.TestCase;
import com.tikqa.web.model.entity.TestStep;
import lombok.AllArgsConstructor;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TestCaseConverter {
    private final ModelMapper modelMapper;

    public TestCase convertTestCaseDTOToEntity(TestCaseRequest testCaseRequest) {

        var testCaseEntity = modelMapper.map(testCaseRequest, TestCase.class);

        for (TestStep testStep : testCaseEntity.getTestSteps()
        ) {
            testStep.setTestCase(testCaseEntity);
            testStep.getTestCaseEvent().setTestSteps(testCaseEntity.getTestSteps());

            for (EventParam eventParam : testStep.getTestCaseEvent().getEventParam()
            ) {
                eventParam.setTestCaseEvent(testStep.getTestCaseEvent());
            }

        }

        return testCaseEntity;
    }

    public TestCaseResponse convertTestCaseEntityToResponse(TestCase testCase) {

        return modelMapper.map(testCase, TestCaseResponse.class);
    }

    public List<TestCaseResponse> convertTestCaseEntityListToResponseList(List<TestCase> testCase) {
        return modelMapper.map(testCase, new TypeToken<List<TestCaseResponse>>() {
        }.getType());

    }


    public TestCaseResponse convertTestCaseEntityToDTO(TestCase testCase) {
        return modelMapper.map(testCase, TestCaseResponse.class);
    }
}
