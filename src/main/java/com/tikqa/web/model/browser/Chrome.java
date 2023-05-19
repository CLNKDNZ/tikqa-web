package com.tikqa.web.model.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome extends Browser {

    @Override
    public WebDriver create() {
        return new ChromeDriver();
    }
}
