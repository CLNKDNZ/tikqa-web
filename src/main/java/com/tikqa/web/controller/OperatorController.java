package com.tikqa.web.controller;


import com.tikqa.web.model.dto.response.RestResponse;
import com.tikqa.web.model.entity.*;
import com.tikqa.web.service.OperatorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/operator")
@CrossOrigin("*")
public class OperatorController {

    private final OperatorService operatorService;

    @CrossOrigin("*")
    @GetMapping("operating-system/{platformId}")
    public RestResponse<List<OperatingSystem>> getOperatingSystemList(@PathVariable Long platformId) {
        var result = operatorService.getAllOperatingSystemByPlatformId(platformId);
        return result;
    }

    @CrossOrigin("*")
    @GetMapping("operating-system-version/{operatingSystemId}")
    public RestResponse<List<OperatingSystemVersion>> getOperatingSystemVersionList(
            @PathVariable Long operatingSystemId) {
        var result = operatorService.getAllOperatingSystemVersionByOperatingSystemId(operatingSystemId);
        return result;
    }

    @CrossOrigin("*")
    @GetMapping("browser/{operatingSystemId}")
    public RestResponse<List<Browser>> getBrowserList(@PathVariable Long operatingSystemId) {
        var result = operatorService.getAllBrowserByOperatingSystemId(operatingSystemId);
        return result;
    }

    @CrossOrigin("*")
    @GetMapping("browser-version/{browserId}")
    public RestResponse<List<BrowserVersion>> getBrowserVersionList(@PathVariable Long browserId) {
        var result = operatorService.getAllBrowserVersionByBrowserId(browserId);
        return result;
    }

    @CrossOrigin("*")
    @GetMapping("platform")
    public RestResponse<List<Platform>> getPlatformList() {
        var result = operatorService.getAllPlatformList();
        return result;
    }
}