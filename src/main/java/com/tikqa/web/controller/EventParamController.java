package com.tikqa.web.controller;

import com.automasi.nocodeautomation.model.dto.request.EventParamRequest;
import com.automasi.nocodeautomation.model.dto.request.EventParamResponse;
import com.automasi.nocodeautomation.model.dto.response.RestResponse;
import com.automasi.nocodeautomation.service.EventParamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/event-param")
@CrossOrigin("*")
public class EventParamController {
    private final EventParamService eventParamService;

    @CrossOrigin("*")
    @PostMapping
    public RestResponse<EventParamResponse> save(@RequestBody EventParamRequest eventParamRequest) {
        return eventParamService.save(eventParamRequest);
    }

    @CrossOrigin("*")
    @PutMapping("/{id}")
    public RestResponse<EventParamResponse> update(@PathVariable Long id, @RequestBody EventParamRequest eventParamRequest) {
        return eventParamService.update(eventParamRequest, id);
    }

    @CrossOrigin("*")
    @DeleteMapping("/{id}")
    public RestResponse<String> delete(@PathVariable Long id) {
        return eventParamService.delete(id);
    }

    @CrossOrigin("*")
    @GetMapping
    public RestResponse<List<EventParamResponse>> getAllTestCaseEvent() {
        return eventParamService.getAllEventParams();
    }

    @CrossOrigin("*")
    @GetMapping("/{id}")
    public RestResponse<EventParamResponse> getById(@PathVariable Long id) {
        return eventParamService.getById(id);
    }
}
