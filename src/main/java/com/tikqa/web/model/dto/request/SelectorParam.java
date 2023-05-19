package com.tikqa.web.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectorParam {

    @JsonProperty("selector_type")
    private String type;
    @JsonProperty("selector_value")
    private String value;
}
