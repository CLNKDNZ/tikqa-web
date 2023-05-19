package com.tikqa.web.util.converters;


import com.tikqa.web.model.dto.request.SelectorTypeRequest;
import com.tikqa.web.model.dto.request.SelectorTypeResponse;
import com.tikqa.web.model.entity.SelectorType;
import lombok.AllArgsConstructor;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
