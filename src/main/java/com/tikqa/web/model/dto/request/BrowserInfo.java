package com.tikqa.web.model.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrowserInfo {
    @JsonProperty("browser_name")
    private String browserName;
}
