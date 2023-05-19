package com.tikqa.web.service.Impl;

import com.automasi.nocodeautomation.model.dto.request.SelectorTypeRequest;
import com.automasi.nocodeautomation.model.dto.request.SelectorTypeResponse;
import com.automasi.nocodeautomation.model.dto.response.RestResponse;
import com.automasi.nocodeautomation.model.entity.SelectorType;
import com.automasi.nocodeautomation.repository.SelectorTypeRepository;
import com.automasi.nocodeautomation.service.SelectorTypeService;
import com.automasi.nocodeautomation.util.converters.SelectorTypeConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.automasi.nocodeautomation.model.dto.response.RestResponse.fail;
import static com.automasi.nocodeautomation.model.dto.response.RestResponse.success;
import static java.util.Objects.isNull;

@AllArgsConstructor
@Service
public class SelectorTypeServiceImpl implements SelectorTypeService {

    private final SelectorTypeRepository selectorTypeRepository;
    private final SelectorTypeConverter selectorTypeConverter;

    @Override
    public RestResponse<SelectorTypeResponse> save(SelectorTypeRequest selectorTypeRequest) {
        SelectorType selectorTypeEntity = selectorTypeConverter.convertTestCaseEventDTOToEntity(selectorTypeRequest);
        var savedItem = selectorTypeRepository.save(selectorTypeEntity);
        if (isNull(savedItem))
            return fail("errorCode", "error message");
        var eventParamResponse = selectorTypeConverter.convertTestCaseEventEntityToDTO(savedItem);
        return success(eventParamResponse);
    }

    @Override
    public RestResponse<SelectorTypeResponse> update(SelectorTypeRequest selectorTypeRequest, Long id) {
        var existingEvent = selectorTypeRepository.findById(id);
        SelectorType selectorType = null;
        if (!existingEvent.isPresent())
            return fail("hata kodu", "hata mesajı");

        existingEvent = Optional.of(selectorTypeConverter.convertTestCaseEventDTOToEntity(selectorTypeRequest));
        selectorType = selectorTypeRepository.save(existingEvent.get());
        var eventParamResponse = selectorTypeConverter.convertTestCaseEventEntityToDTO(selectorType);

        return success(eventParamResponse);
    }

    @Override
    public RestResponse<String> delete(Long id) {
        selectorTypeRepository.deleteById(id);
        return success("Item deleted successfully");

    }

    @Override
    public RestResponse<List<SelectorTypeResponse>> getAllSelectorTyes() {
        var selectorTypeList = selectorTypeRepository.findAll();
        var selectorTypeResponseList = selectorTypeConverter.convertTestCaseEventEntityListToResponseList(selectorTypeList);
        return success(selectorTypeResponseList);
    }


    @Override
    public RestResponse<SelectorTypeResponse> getById(Long id) {
        var selectorType = selectorTypeRepository.findById(id);
        var selectorTypeResponse = selectorTypeConverter.convertTestCaseEventEntityToResponse(selectorType.get());
        return success(selectorTypeResponse);
    }

}
