package com.tikqa.web.model.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge extends Browser {

    public Edge() {
        create();
    }

    @Override
    public WebDriver create() {
        return new EdgeDriver();
    }
}
