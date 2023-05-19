package com.tikqa.web.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public interface Selectable {

    WebElement getWebElementBySelector(String selectorType, String selectorValue, WebDriver driver);
}
