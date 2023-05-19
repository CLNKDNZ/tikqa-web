package com.tikqa.web.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/test-step")
@CrossOrigin("*")
public class TestStepController {

    private final TestStepService testStepService;


    @PostMapping
    public RestResponse<TestStepResponse> save(@RequestBody TestStepRequest testStepRequest) {
        return testStepService.save(testStepRequest);
    }

    @CrossOrigin("*")
    @PutMapping("/{id}")
    public RestResponse<TestStepResponse> update(@PathVariable Long id, @RequestBody TestStepRequest testStepRequest) {
        return testStepService.update(testStepRequest, id);

    }

    @CrossOrigin("*")
    @DeleteMapping("/{id}")
    public RestResponse<String> delete(@PathVariable Long id, @RequestBody TestStepRequest testStepRequest) {

        return testStepService.delete(id);
    }

    @GetMapping
    public RestResponse<List<TestStepResponse>> getAll() {
        return testStepService.getAll();
    }

    @GetMapping("/{id}")
    public RestResponse<TestStepResponse> getById(@PathVariable Long id) {
        return testStepService.getById(id);

    }
}
