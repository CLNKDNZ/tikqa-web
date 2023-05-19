package com.tikqa.web.util.converters;


import lombok.AllArgsConstructor;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class SelectorTypeConverter {
    private final ModelMapper modelMapper;

    public SelectorType convertTestCaseEventDTOToEntity(SelectorTypeRequest selectorTypeRequest) {
        return modelMapper.map(selectorTypeRequest, SelectorType.class);
    }

    public SelectorTypeResponse convertTestCaseEventEntityToResponse(SelectorType selectorType) {
        return modelMapper.map(selectorType, SelectorTypeResponse.class);
    }

    public List<SelectorTypeResponse> convertTestCaseEventEntityListToResponseList(List<SelectorType> selectorTypeList) {
        return modelMapper.map(selectorTypeList, new TypeToken<List<SelectorTypeResponse>>() {
        }.getType());
    }

    public SelectorTypeResponse convertTestCaseEventEntityToDTO(SelectorType selectorType) {
        return modelMapper.map(selectorType, SelectorTypeResponse.class);
    }
}
