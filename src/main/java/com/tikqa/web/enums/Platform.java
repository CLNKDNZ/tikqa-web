package com.tikqa.web.enums;

public enum Platform {

    TABLET("TABLET", "Tablet", 1L),
    WEB("WEB", "Web", 2L),
    MOBILE_APP("MOBILE_APP", "Mobil Uygulama", 3L),
    MOBILE_VIEW("MOBILE_VIEW", "Mobil Görünüm", 4L);


    private final String platformKey;
    private final String platformName;
    private final Long id;


    Platform(String platformKey, String platformName, Long id) {
        this.platformKey = platformKey;
        this.id = id;
        this.platformName = platformName;
    }
}
