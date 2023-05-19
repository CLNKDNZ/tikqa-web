package com.tikqa.web.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Relation {
    @JsonProperty("link_from")
    private String from;
    @JsonProperty("link_to")
    private String to;
}
