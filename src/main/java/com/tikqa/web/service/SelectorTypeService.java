package com.tikqa.web.service;

import com.automasi.nocodeautomation.model.dto.request.SelectorTypeRequest;
import com.automasi.nocodeautomation.model.dto.request.SelectorTypeResponse;
import com.automasi.nocodeautomation.model.dto.response.RestResponse;

import java.util.List;

public interface SelectorTypeService {

    RestResponse<SelectorTypeResponse> save(SelectorTypeRequest selectorTypeRequest);

    RestResponse<SelectorTypeResponse> update(SelectorTypeRequest selectorTypeRequest, Long id);

    RestResponse<String> delete(Long id);

    RestResponse<List<SelectorTypeResponse>> getAllSelectorTyes();

    RestResponse<SelectorTypeResponse> getById(Long Id);
}
