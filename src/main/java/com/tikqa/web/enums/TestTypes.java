package com.tikqa.web.enums;


public enum TestTypes {
    MOBILE("mobile", 1L, ""),
    WEB("web", 2L, ""),
    API("api", 3L, ""),
    JMETER("jmeter", 4L, "");


    public final String state;
    public final Long id;
    public final String description;

    TestTypes(String state, Long id, String description) {
        this.state = state;
        this.id = id;
        this.description = description;
    }

}
