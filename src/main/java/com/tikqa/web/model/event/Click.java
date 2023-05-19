package com.tikqa.web.model.event;

import com.automasi.nocodeautomation.model.Selectable;
import com.automasi.nocodeautomation.model.SelectableImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click extends Event {

    private Selectable selectable;
    private final String selectorType;
    private final String selectorValue;

    public Click(String selectorType, String selectorValue) {
        this.selectorType = selectorType;
        this.selectorValue = selectorValue;
        selectable = new SelectableImpl();
    }

    @Override
    public void execute(WebDriver driver) {
        WebElement webElement = selectable.getWebElementBySelector(selectorType, selectorValue, driver);
        webElement.click();

    }


}
