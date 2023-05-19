package com.tikqa.web.enums;

public enum BrowserType {

    CHROME("CHROME", "Chrome", 1L),
    SAFARI("SAFARI", "Safari", 2L),
    EDGE("EDGE", "Microsoft Edge", 3L),
    FIREFOX("FIREFOX", "Firefox", 4L),
    INTERNET_EXPLORER("IE", "Internet Explorer", 5L);

    private final String browserKey;
    private final String browserName;
    private final Long id;


    BrowserType(String browserKey, String browserName, Long id) {
        this.browserKey = browserKey;
        this.browserName = browserName;
        this.id = id;
    }
}
