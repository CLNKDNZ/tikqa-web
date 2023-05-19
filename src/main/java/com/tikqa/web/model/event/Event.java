package com.tikqa.web.model.event;

import org.openqa.selenium.WebDriver;

public abstract class Event {

    private WebDriver driver;

    public abstract void execute(WebDriver driver);

}
