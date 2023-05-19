package com.tikqa.web.model.event;

import org.openqa.selenium.WebDriver;

public class GoToUrl extends Event {


    private final String url;

    public GoToUrl(String url) {
        this.url = url;
    }

    @Override
    public void execute(WebDriver driver) {

        driver.navigate().to(url);

    }


}
