package com.tikqa.web.model.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari extends Browser {
    public Safari() {
        create();
    }

    @Override
    public WebDriver create() {
        return new SafariDriver();
    }
}
