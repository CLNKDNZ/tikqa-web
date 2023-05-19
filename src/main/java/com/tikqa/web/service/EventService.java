package com.tikqa.web.service;

import com.tikqa.web.model.dto.request.EventRequest;
import com.tikqa.web.model.dto.response.RestResponse;
import com.tikqa.web.model.dto.response.TestCaseEventResponse;
import com.tikqa.web.model.entity.TestCaseEvent;
import org.openqa.selenium.WebDriver;

import java.util.List;

public interface EventService {

    RestResponse<TestCaseEvent> save(EventRequest event);

    RestResponse<TestCaseEvent> update(EventRequest event, Long id);

    RestResponse<String> delete(Long id);

    RestResponse<List<TestCaseEventResponse>> getAllTestCaseEvent();

    RestResponse<TestCaseEventResponse> getById(Long Id);
}
