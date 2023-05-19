package com.tikqa.web;

import org.springframework.stereotype.Component;

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

