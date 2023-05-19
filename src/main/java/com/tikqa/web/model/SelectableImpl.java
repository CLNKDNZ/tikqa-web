package com.tikqa.web.model;

import com.automasi.nocodeautomation.enums.SelectorType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectableImpl implements Selectable {
    @Override
    public WebElement getWebElementBySelector(String selectorType, String selectorValue, WebDriver driver) {

        SelectorType selectorTypes = SelectorType.valueOf(selectorType.toUpperCase());
        switch (selectorTypes) {

            case ID:
                return driver.findElement(By.id(selectorValue));

            case LINK_TEXT:
                return driver.findElement(By.linkText(selectorValue));

            case NAME:
                return driver.findElement(By.name(selectorValue));

            case TAG_NAME:
                return driver.findElement(By.tagName(selectorValue));

            case XPATH:
                return driver.findElement(By.xpath(selectorValue));

            case CLASS_NAME:
                return driver.findElement(By.className(selectorValue));

            case CSS:
                return driver.findElement(By.cssSelector(selectorValue));

            default:
                throw new IllegalStateException("Unexpected value: " + selectorType);
        }
    }
}
