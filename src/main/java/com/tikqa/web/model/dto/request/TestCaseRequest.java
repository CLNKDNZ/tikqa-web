package com.tikqa.web.model.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TestCaseRequest {
    private String name;
    private String type;
    private String description;
    private Boolean isHeadless;
    private Boolean isGrid;
    private List<TestStepRequest> testSteps;
}
