package com.tikqa.web.service;

import org.openqa.selenium.WebDriver;

public interface BrowserService {
    public WebDriver create(String browserName);


}
