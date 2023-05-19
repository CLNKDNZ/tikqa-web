package com.tikqa.web;

import org.springframework.stereotype.Component;


@Component
public class EventFactory {
/*
    public Event createEvent(TestStep testStep) {

        SelectorParam selectorParams = testStep.g();
        EventParam eventParams = testStep.getEventParam();

        EventName eventNames = EventName.valueOf(testStep.getName().toUpperCase());
        switch (eventNames) {
            case SEND_KEY:
                return new SendKey(selectorParams.getType(), selectorParams.getValue(), eventParams.getKeyText());


            case GO_TO_URL:
                return new GoToUrl(eventParams.getUrl());

            case CLICK:
                return new Click(selectorParams.getType(), selectorParams.getValue());
            default:
                throw new IllegalStateException("Unexpected value: " + testStep.getName());
        }
    }*/

}
