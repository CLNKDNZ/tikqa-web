package com.tikqa.web.enums;

public enum SelectorType {

    XPATH("xpath", 1L, ""),
    ID("id", 2L, ""),
    CSS("css", 3L, ""),
    LINK_TEXT("linkText", 4L, ""),
    NAME("name", 5L, ""),
    TAG_NAME("tagName", 6L, ""),
    CLASS_NAME("className", 7L, "");

    public final String type;
    public final Long id;
    public final String description;

    SelectorType(String label, Long id, String description) {
        this.type = label;
        this.id = id;
        this.description = description;
    }
}
