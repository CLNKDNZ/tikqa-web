package com.tikqa.web.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventParam {
    @JsonProperty("url")
    private String url;

    //For SendKey
    @JsonProperty("keyText")
    private String keyText;

    //For CustomWindowSize
    @JsonProperty("width")
    private int width;

    //For CustomWindowSize
    @JsonProperty("height")
    private Integer height;

    //For SetCss
    @JsonProperty("css")
    private String cssValue;

    //For SelectByIndex
    @JsonProperty("selectIndex")
    private Integer selectIndex;

    //For SelectByText
    @JsonProperty("selectText")
    private String selectText;

    //For SelectByValue
    @JsonProperty("selectValue")
    private String selectValue;

    //For ExecJavaScript
    @JsonProperty("jsValue")
    private String jsValue;
}
