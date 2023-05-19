package com.tikqa.web.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;



@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/test-case")
@CrossOrigin("*")
public class TestCaseController {

    private final TestCaseService testCaseService;

    @CrossOrigin("*")
    @PostMapping
    public RestResponse<TestCaseResponse> save(@RequestBody TestCaseRequest testCaseRequest) {
        return testCaseService.save(testCaseRequest);
    }

    @CrossOrigin("*")
    @PutMapping("/{id}")
    public RestResponse<TestCaseResponse> update(@PathVariable Long id, @RequestBody TestCaseRequest testCaseRequest) {
        return testCaseService.update(testCaseRequest, id);
    }

    @CrossOrigin("*")
    @DeleteMapping("/{id}")
    public void delete(@PathParam("id") Long id) {
        testCaseService.delete(id);
    }

    @CrossOrigin("*")
    @GetMapping
    public RestResponse<List<TestCaseResponse>> getAllEvent() {
        return testCaseService.getAll();
    }

    @CrossOrigin("*")
    @GetMapping("/{id}")
    public RestResponse<TestCaseResponse> getById(@PathVariable("id") Long id) {
        return testCaseService.getById(id);
    }
}
