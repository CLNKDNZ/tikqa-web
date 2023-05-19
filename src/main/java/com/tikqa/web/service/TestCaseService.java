package com.tikqa.web.service;

import com.automasi.nocodeautomation.model.dto.request.TestCaseRequest;
import com.automasi.nocodeautomation.model.dto.response.RestResponse;
import com.automasi.nocodeautomation.model.dto.response.TestCaseResponse;

import java.util.List;

public interface TestCaseService {

    RestResponse<TestCaseResponse> save(TestCaseRequest testCaseRequest);

    RestResponse<TestCaseResponse> update(TestCaseRequest testCaseRequest, Long id);

    RestResponse<String> delete(Long id);

    RestResponse<List<TestCaseResponse>> getAll();

    RestResponse<TestCaseResponse> getById(Long id);
}
