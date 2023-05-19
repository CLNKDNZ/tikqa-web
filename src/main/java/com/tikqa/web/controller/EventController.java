package com.tikqa.web.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/event")
@CrossOrigin("*")
public class EventController {

    private final EventService eventService;

    @CrossOrigin("*")
    @PostMapping
    public RestResponse<TestCaseEvent> save(@RequestBody EventRequest eventRequest) {
        return eventService.save(eventRequest);
    }

    @CrossOrigin("*")
    @PutMapping("/{id}")
    public RestResponse<TestCaseEvent> update(@PathVariable Long id, @RequestBody EventRequest eventRequest) {
        return eventService.update(eventRequest, id);
    }

    @CrossOrigin("*")
    @DeleteMapping("/{id}")
    public RestResponse<String> delete(@PathVariable Long id) {
        return eventService.delete(id);
    }

    @CrossOrigin("*")
    @GetMapping
    public RestResponse<List<TestCaseEventResponse>> getAllTestCaseEvent() {
        return eventService.getAllTestCaseEvent();
    }

    @CrossOrigin("*")
    @GetMapping("/{id}")
    public RestResponse<TestCaseEventResponse> getById(@PathVariable Long id) {
        return eventService.getById(id);
    }
}
