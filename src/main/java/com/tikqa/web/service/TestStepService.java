package com.tikqa.web.service;


import com.tikqa.web.model.dto.request.TestStepRequest;
import com.tikqa.web.model.dto.response.RestResponse;
import com.tikqa.web.model.dto.response.TestStepResponse;

import java.util.List;

public interface TestStepService {

    RestResponse<TestStepResponse> save(TestStepRequest testStepRequest);

    RestResponse<TestStepResponse> update(TestStepRequest testStepRequest, Long id);

    RestResponse<String> delete(Long id);

    RestResponse<List<TestStepResponse>> getAll();

    RestResponse<TestStepResponse> getById(Long id);
}
