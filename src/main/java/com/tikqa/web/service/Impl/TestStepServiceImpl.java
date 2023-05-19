package com.tikqa.web.service.Impl;


import com.tikqa.web.model.dto.request.TestStepRequest;
import com.tikqa.web.model.dto.response.RestResponse;
import com.tikqa.web.model.dto.response.TestStepResponse;
import com.tikqa.web.model.entity.TestStep;
import com.tikqa.web.repository.TestStepRepository;
import com.tikqa.web.service.TestStepService;
import com.tikqa.web.util.converters.TestStepConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class TestStepServiceImpl implements TestStepService {

    private final TestStepRepository testStepRepository;
    private final TestStepConverter testStepConverter;

    @Override
    public RestResponse<TestStepResponse> save(TestStepRequest testStepRequest) {

        TestStep mappedTestStep = testStepConverter.convertTestStepDTOToEntity(testStepRequest);
        var savedTestStep = testStepRepository.save(mappedTestStep);
        var result = testStepConverter.convertTestStepEntityToResponse(savedTestStep);
        return success(result);
    }

    @Override
    public RestResponse<TestStepResponse> update(TestStepRequest testStepRequest, Long id) {
        var existingTestStep = testStepRepository.getById(id);
        existingTestStep = testStepConverter.convertTestStepDTOToEntity(testStepRequest);
        var savedData = testStepRepository.save(existingTestStep);
        var testStepResponse = testStepConverter.convertTestStepEntityToResponse(savedData);
        return RestResponse.success(testStepResponse);
    }

    @Override
    public RestResponse<String> delete(Long id) {
        testStepRepository.deleteById(id);
        return success("Deleted");
    }

    @Override
    public RestResponse<List<TestStepResponse>> getAll() {
        var testSteps = testStepRepository.findAll();
        var responseList = testStepConverter.convertTestStepEntityListToResponseList(testSteps);
        return success(responseList);
    }

    @Override
    public RestResponse<TestStepResponse> getById(Long id) {
        var testStep = testStepRepository.getById(id);
        var response = testStepConverter.convertTestStepEntityToResponse(testStep);
        return success(response);
    }
}
