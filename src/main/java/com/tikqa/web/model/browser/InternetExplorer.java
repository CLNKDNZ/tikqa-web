package com.tikqa.web.model.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer extends Browser {

    @Override
    public WebDriver create() {
        return new InternetExplorerDriver();
    }
}
