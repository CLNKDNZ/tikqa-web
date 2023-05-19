package com.tikqa.web.service;

import com.tikqa.web.model.dto.request.EventParamRequest;
import com.tikqa.web.model.dto.request.EventParamResponse;
import com.tikqa.web.model.dto.response.RestResponse;

import java.util.List;

public interface EventParamService {

    RestResponse<EventParamResponse> save(EventParamRequest event);

    RestResponse<EventParamResponse> update(EventParamRequest event, Long id);

    RestResponse<String> delete(Long id);

    RestResponse<List<EventParamResponse>> getAllEventParams();

    RestResponse<EventParamResponse> getById(Long Id);
}
