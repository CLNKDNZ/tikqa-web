package com.tikqa.web.service;



public interface SelectorTypeService {

    RestResponse<SelectorTypeResponse> save(SelectorTypeRequest selectorTypeRequest);

    RestResponse<SelectorTypeResponse> update(SelectorTypeRequest selectorTypeRequest, Long id);

    RestResponse<String> delete(Long id);

    RestResponse<List<SelectorTypeResponse>> getAllSelectorTyes();

    RestResponse<SelectorTypeResponse> getById(Long Id);
}
