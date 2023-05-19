package com.tikqa.web.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestStep {

    @JsonProperty("event_id")
    private String id;
    @JsonProperty("event_name")
    private String name;
    @JsonProperty("event_order")
    private String order;
    @JsonProperty("event_description")
    private String description;
    @JsonProperty("selector_param")
    private SelectorParam selectorParam;

    @JsonProperty("event_param")
    private EventParam eventParam;

    @JsonProperty("relations")
    private Relation relation;


}
