package com.tikqa.web.model.dto.response;

import com.automasi.nocodeautomation.model.dto.request.TestStepRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TestCaseResponse {
    private Long id;
    private String name;
    private String type;
    private String description;
    private Boolean isHeadless;
    private Boolean isGrid;
    private List<TestStepRequest> testSteps;
}
