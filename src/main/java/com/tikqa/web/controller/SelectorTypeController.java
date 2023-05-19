package com.tikqa.web.controller;

import com.automasi.nocodeautomation.model.dto.request.SelectorTypeRequest;
import com.automasi.nocodeautomation.model.dto.request.SelectorTypeResponse;
import com.automasi.nocodeautomation.model.dto.response.RestResponse;
import com.automasi.nocodeautomation.service.SelectorTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/selector")
@CrossOrigin("*")
public class SelectorTypeController {
    private final SelectorTypeService selectorTypeService;

    @CrossOrigin("*")
    @PostMapping
    public RestResponse<SelectorTypeResponse> save(@RequestBody SelectorTypeRequest selectorTypeRequest) {
        return selectorTypeService.save(selectorTypeRequest);
    }

    @CrossOrigin("*")
    @PutMapping("/{id}")
    public RestResponse<SelectorTypeResponse> update(@PathVariable Long id, @RequestBody SelectorTypeRequest selectorTypeRequest) {
        return selectorTypeService.update(selectorTypeRequest, id);
    }

    @CrossOrigin("*")
    @DeleteMapping("/{id}")
    public RestResponse<String> delete(@PathVariable Long id) {
        return selectorTypeService.delete(id);
    }

    @CrossOrigin("*")
    @GetMapping
    public RestResponse<List<SelectorTypeResponse>> getAllSelectorTypes() {
        return selectorTypeService.getAllSelectorTyes();
    }

    @CrossOrigin("*")
    @GetMapping("/{id}")
    public RestResponse<SelectorTypeResponse> getById(@PathVariable Long id) {
        return selectorTypeService.getById(id);
    }
}
