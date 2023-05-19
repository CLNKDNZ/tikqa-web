package com.tikqa.web.service.Impl;

import com.automasi.nocodeautomation.model.dto.request.TestCaseRequest;
import com.automasi.nocodeautomation.model.dto.response.RestResponse;
import com.automasi.nocodeautomation.model.dto.response.TestCaseResponse;
import com.automasi.nocodeautomation.model.entity.TestCase;
import com.automasi.nocodeautomation.repository.TestCaseRepository;
import com.automasi.nocodeautomation.service.TestCaseService;
import com.automasi.nocodeautomation.util.converters.TestCaseConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TestCaseServiceImpl implements TestCaseService {
    private final TestCaseConverter testCaseConverter;
    private final TestCaseRepository testCaseRepository;

    @Transactional
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
