package com.tikqa.web.model.event;

import com.automasi.nocodeautomation.model.Selectable;
import com.automasi.nocodeautomation.model.SelectableImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Previous extends Event {
    private Selectable selectable;

    private final String selectorType;
    private final String selectorValue;
    private final String text;

    public Previous(String selectorType, String selectorValue, String text) {
        this.selectorType = selectorType;
        this.selectorValue = selectorValue;
        this.text = text;
        selectable = new SelectableImpl();
    }


    @Override
    public void execute(WebDriver driver) {
        WebElement webElement = selectable.getWebElementBySelector(selectorType, selectorValue, driver);
        webElement.sendKeys(text);
    }


}
