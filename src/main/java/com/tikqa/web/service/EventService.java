package com.tikqa.web.service;

import com.automasi.nocodeautomation.model.dto.request.EventRequest;
import com.automasi.nocodeautomation.model.dto.request.TestStepRequest;
import com.automasi.nocodeautomation.model.dto.response.RestResponse;
import com.automasi.nocodeautomation.model.dto.response.TestCaseEventResponse;
import com.automasi.nocodeautomation.model.entity.TestCaseEvent;
import com.automasi.nocodeautomation.model.event.Event;
import org.openqa.selenium.WebDriver;

import java.util.List;

public interface EventService {

    Event create(TestStepRequest eventName);

    void execute(Event event, WebDriver webDriver);

    RestResponse<TestCaseEvent> save(EventRequest event);

    RestResponse<TestCaseEvent> update(EventRequest event, Long id);

    RestResponse<String> delete(Long id);

    RestResponse<List<TestCaseEventResponse>> getAllTestCaseEvent();

    RestResponse<TestCaseEventResponse> getById(Long Id);
}