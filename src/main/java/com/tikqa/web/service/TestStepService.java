package com.tikqa.web.service;


public interface TestStepService {

    RestResponse<TestStepResponse> save(TestStepRequest testStepRequest);

    RestResponse<TestStepResponse> update(TestStepRequest testStepRequest, Long id);

    RestResponse<String> delete(Long id);

    RestResponse<List<TestStepResponse>> getAll();

    RestResponse<TestStepResponse> getById(Long id);
}
