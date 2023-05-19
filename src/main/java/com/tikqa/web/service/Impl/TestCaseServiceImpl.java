package com.tikqa.web.service.Impl;


import com.tikqa.web.model.dto.request.TestCaseRequest;
import com.tikqa.web.model.dto.response.RestResponse;
import com.tikqa.web.model.dto.response.TestCaseResponse;
import com.tikqa.web.model.entity.TestCase;
import com.tikqa.web.repository.TestCaseRepository;
import com.tikqa.web.service.TestCaseService;
import com.tikqa.web.util.converters.TestCaseConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class TestCaseServiceImpl implements TestCaseService {
    private final TestCaseConverter testCaseConverter;
    private final TestCaseRepository testCaseRepository;

    @Override
    public RestResponse<TestCaseResponse> save(TestCaseRequest testCaseRequest) {
        TestCase mappedTestCase = testCaseConverter.convertTestCaseDTOToEntity(testCaseRequest);
        TestCase testCase = testCaseRepository.save(mappedTestCase);
        TestCaseResponse testCaseResponse = testCaseConverter.convertTestCaseEntityToResponse(testCase);
        return RestResponse.success(testCaseResponse);
    }

    @Override
    public RestResponse<TestCaseResponse> update(TestCaseRequest testCaseRequest, Long id) {
        TestCase existingTestCase = testCaseRepository.getById(id);
        existingTestCase = testCaseConverter.convertTestCaseDTOToEntity(testCaseRequest);
        var savedData = testCaseRepository.save(existingTestCase);
        TestCaseResponse testCaseResponse = testCaseConverter.convertTestCaseEntityToResponse(savedData);
        return RestResponse.success(testCaseResponse);
    }

    @Override
    public RestResponse<String> delete(Long id) {
        testCaseRepository.deleteById(id);
        return RestResponse.success("Deleted Test Case Id :" + id);
    }

    @Override
    public RestResponse<List<TestCaseResponse>> getAll() {
        List<TestCase> testCaseList = testCaseRepository.findAll();
        var testCaseResponse = testCaseConverter.convertTestCaseEntityListToResponseList(testCaseList);
        return RestResponse.success(testCaseResponse);
    }

    @Override
    public RestResponse<TestCaseResponse> getById(Long id) {
        TestCaseResponse testCaseResponse = new TestCaseResponse();
        Optional<TestCase> testCase = testCaseRepository.findById(id);
        if (testCase.isPresent()) {
            testCaseResponse = testCaseConverter.convertTestCaseEntityToDTO(testCase.get());
        }
        return RestResponse.success(testCaseResponse);
    }
}
