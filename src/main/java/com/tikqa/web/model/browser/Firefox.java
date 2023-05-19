package com.tikqa.web.model.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox extends Browser {
    public Firefox() {
        create();
    }

    @Override
    public WebDriver create() {
        return new FirefoxDriver();
    }


}
