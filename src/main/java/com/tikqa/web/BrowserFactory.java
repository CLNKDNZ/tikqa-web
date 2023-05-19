package com.tikqa.web;

import com.automasi.nocodeautomation.model.browser.*;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.remote.BrowserType.*;

@Component
public class BrowserFactory {
    public Browser createBrowser(String browser) {

        if (CHROME.equalsIgnoreCase(browser)) {
            return new Chrome();
        } else if (FIREFOX.equalsIgnoreCase(browser)) {
            return new Firefox();
        } else if (IE.equalsIgnoreCase(browser)) {
            return new InternetExplorer();
        } else {
            return new Edge();
        }

    }
}

