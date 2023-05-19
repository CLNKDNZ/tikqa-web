package com.tikqa.web.model.browser;

import org.openqa.selenium.WebDriver;

public abstract class Browser {

    private String browserName;

    public abstract WebDriver create();
}
