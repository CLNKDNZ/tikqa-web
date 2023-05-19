package com.tikqa.web.service;

import com.automasi.nocodeautomation.model.dto.response.RestResponse;
import com.automasi.nocodeautomation.model.entity.*;

import java.util.List;

public interface OperatorService {

    RestResponse<List<OperatingSystem>> getAllOperatingSystemByPlatformId(Long platformId);

    RestResponse<List<OperatingSystemVersion>> getAllOperatingSystemVersionByOperatingSystemId(Long operatingSystemId);

    RestResponse<List<Browser>> getAllBrowserByOperatingSystemId(Long operatingSystemId);

    RestResponse<List<BrowserVersion>> getAllBrowserVersionByBrowserId(Long browserId);

    RestResponse<List<Platform>> getAllPlatformList();
}
