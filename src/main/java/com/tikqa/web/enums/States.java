package com.tikqa.web.enums;


public enum States {
    ACTIVE("active", 1L, ""),
    PASSIVE("passive", 2L, ""),
    DELETED("deleted", 3L, ""),
    DRAFT("draft", 4L, ""),
    READY("ready", 5L, "");

    public final String state;
    public final Long id;
    public final String description;

    States(String state, Long id, String description) {
        this.state = state;
        this.id = id;
        this.description = description;
    }

}
