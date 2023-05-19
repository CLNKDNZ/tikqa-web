package com.tikqa.web.service;

import java.util.List;

public interface EventParamService {

    RestResponse<EventParamResponse> save(EventParamRequest event);

    RestResponse<EventParamResponse> update(EventParamRequest event, Long id);

    RestResponse<String> delete(Long id);

    RestResponse<List<EventParamResponse>> getAllEventParams();

    RestResponse<EventParamResponse> getById(Long Id);
}
