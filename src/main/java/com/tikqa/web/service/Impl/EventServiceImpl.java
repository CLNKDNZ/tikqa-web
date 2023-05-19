package com.tikqa.web.service.Impl;


import com.tikqa.web.model.dto.request.EventRequest;
import com.tikqa.web.model.dto.request.TestStepRequest;
import com.tikqa.web.model.dto.response.RestResponse;
import com.tikqa.web.model.dto.response.TestCaseEventResponse;
import com.tikqa.web.model.entity.TestCaseEvent;
import com.tikqa.web.repository.EventRepository;
import com.tikqa.web.service.EventService;
import com.tikqa.web.util.converters.EventConverter;
import com.tikqa.web.util.converters.TestCaseEventConverter;
import lombok.AllArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

import static com.tikqa.web.model.dto.response.RestResponse.*;
import static java.util.Objects.isNull;

@AllArgsConstructor
@Service
public class EventServiceImpl implements EventService {
    private final EventConverter eventConverter;
    private final TestCaseEventConverter testCaseEventConverter;
    private final EventRepository eventRepository;




    @Override
    public RestResponse<TestCaseEvent> save(EventRequest eventRequest) {
        TestCaseEvent eventEntity = eventConverter.convertEventDTOToEntity(eventRequest);
        var savedItem = eventRepository.save(eventEntity);
        if (isNull(savedItem))
            return fail("errorCode", "error message");

        return success(savedItem);
    }

    @Override
    public RestResponse<TestCaseEvent> update(EventRequest eventRequest, Long id) {
        var existingEvent = eventRepository.findById(id);
        TestCaseEvent testCaseEvent = null;
        if (!existingEvent.isPresent())
            return fail("hata kodu", "hata mesajı");

        existingEvent = Optional.of(eventConverter.convertEventDTOToEntity(eventRequest));
        testCaseEvent = eventRepository.save(existingEvent.get());
        return success(testCaseEvent);
    }

    @Override
    public RestResponse<String> delete(Long id) {
        eventRepository.deleteById(id);
        return success("Item deleted successfully");

    }

    @Override
    public RestResponse<List<TestCaseEventResponse>> getAllTestCaseEvent() {
        var testCaseEventList = eventRepository.findAll();
        var testCaseEventResponseList = testCaseEventConverter.convertTestCaseEventEntityListToResponseList(testCaseEventList);
        return success(testCaseEventResponseList);
    }


    @Override
    public RestResponse<TestCaseEventResponse> getById(Long id) {
        var testCaseEvent = eventRepository.findById(id);
        var testCaseEventResponse = testCaseEventConverter.convertTestCaseEventEntityToResponse(testCaseEvent.get());
        return success(testCaseEventResponse);
    }

}
