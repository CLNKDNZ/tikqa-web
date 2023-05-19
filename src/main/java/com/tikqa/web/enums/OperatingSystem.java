package com.tikqa.web.enums;

public enum OperatingSystem {

    WINDOWS("WINDOWS", "Windows", 1L),
    MAC_OS("MAC_OS", "Mac", 2L),
    LINUX("LINUX", "Linux", 3L);

    private final String OSKey;
    private final String OSName;
    private final Long id;

    OperatingSystem(String OSKey, String OSName, Long id) {
        this.OSKey = OSKey;
        this.id = id;
        this.OSName = OSName;
    }
}
