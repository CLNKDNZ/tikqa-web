package com.tikqa.web.model.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScenarioRequest {

    @JsonProperty("test_model")
    private TestModel testModel;


}
