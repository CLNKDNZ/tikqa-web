package com.tikqa.web.service.Impl;

import com.automasi.nocodeautomation.model.dto.request.EventParamRequest;
import com.automasi.nocodeautomation.model.dto.request.EventParamResponse;
import com.automasi.nocodeautomation.model.dto.response.RestResponse;
import com.automasi.nocodeautomation.model.entity.EventParam;
import com.automasi.nocodeautomation.repository.EventParamRepository;
import com.automasi.nocodeautomation.service.EventParamService;
import com.automasi.nocodeautomation.util.converters.EventParamConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.automasi.nocodeautomation.model.dto.response.RestResponse.fail;
import static com.automasi.nocodeautomation.model.dto.response.RestResponse.success;
import static java.util.Objects.isNull;

@AllArgsConstructor
@Service
public class EventParamServiceImpl implements EventParamService {

    private final EventParamRepository eventParamRepository;
    private final EventParamConverter eventParamConverter;

    @Override
    public RestResponse<EventParamResponse> save(EventParamRequest eventParamRequest) {
        EventParam eventParamEntity = eventParamConverter.convertEventParamDTOToEntity(eventParamRequest);
        var savedItem = eventParamRepository.save(eventParamEntity);
        if (isNull(savedItem))
            return fail("errorCode", "error message");
        var eventParamResponse = eventParamConverter.convertEventParamEntityToResponse(savedItem);
        return success(eventParamResponse);
    }

    @Override
    public RestResponse<EventParamResponse> update(EventParamRequest eventParamRequest, Long id) {
        var existingEvent = eventParamRepository.findById(id);
        EventParam eventParam = null;
        if (!existingEvent.isPresent())
            return fail("hata kodu", "hata mesajı");

        existingEvent = Optional.of(eventParamConverter.convertEventParamDTOToEntity(eventParamRequest));
        eventParam = eventParamRepository.save(existingEvent.get());
        var eventParamResponse = eventParamConverter.convertEventParamEntityToResponse(eventParam);

        return success(eventParamResponse);
    }

    @Override
    public RestResponse<String> delete(Long id) {
        eventParamRepository.deleteById(id);
        return success("Item deleted successfully");

    }

    @Override
    public RestResponse<List<EventParamResponse>> getAllEventParams() {
        var eventParamList = eventParamRepository.findAll();
        var testCaseEventResponseList = eventParamConverter.convertEventParamEntityListToResponseList(eventParamList);
        return success(testCaseEventResponseList);
    }


    @Override
    public RestResponse<EventParamResponse> getById(Long id) {
        var eventParam = eventParamRepository.findById(id);
        var eventParamResponse = eventParamConverter.convertEventParamEntityToResponse(eventParam.get());
        return success(eventParamResponse);
    }

}
