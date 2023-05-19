package com.tikqa.web.enums;

public enum EventName {

    CLICK("click", 1L, ""),
    SEND_KEY("sendKey", 2L, ""),
    GO_TO_URL("goToUrl", 3L, ""),
    REFRESH("refresh", 4L, ""),
    BACK("back", 5L, ""),
    PREVIOUS("previous", 6L, "");

    public final String name;
    public final Long id;
    public final String description;

    EventName(String label, Long id, String description) {
        this.name = label;
        this.id = id;
        this.description = description;
    }
}
