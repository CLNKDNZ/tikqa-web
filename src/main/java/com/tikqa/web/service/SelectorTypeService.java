package com.tikqa.web.service;


import com.tikqa.web.model.dto.request.SelectorTypeRequest;
import com.tikqa.web.model.dto.request.SelectorTypeResponse;
import com.tikqa.web.model.dto.response.RestResponse;

import java.util.List;

public interface SelectorTypeService {

    RestResponse<SelectorTypeResponse> save(SelectorTypeRequest selectorTypeRequest);

    RestResponse<SelectorTypeResponse> update(SelectorTypeRequest selectorTypeRequest, Long id);

    RestResponse<String> delete(Long id);

    RestResponse<List<SelectorTypeResponse>> getAllSelectorTyes();

    RestResponse<SelectorTypeResponse> getById(Long Id);
}
