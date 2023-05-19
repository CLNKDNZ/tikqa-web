package com.tikqa.web.model.dto.request;

import com.automasi.nocodeautomation.enums.BrowserType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestSetting {
    private String platform;
    private String os;
    private BrowserType browser;
    private String browserVersion;
}
