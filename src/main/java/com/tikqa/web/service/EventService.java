package com.tikqa.web.service;

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
