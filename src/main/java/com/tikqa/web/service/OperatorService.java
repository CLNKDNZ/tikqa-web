package com.tikqa.web.service;


public interface OperatorService {

    RestResponse<List<OperatingSystem>> getAllOperatingSystemByPlatformId(Long platformId);

    RestResponse<List<OperatingSystemVersion>> getAllOperatingSystemVersionByOperatingSystemId(Long operatingSystemId);

    RestResponse<List<Browser>> getAllBrowserByOperatingSystemId(Long operatingSystemId);

    RestResponse<List<BrowserVersion>> getAllBrowserVersionByBrowserId(Long browserId);

    RestResponse<List<Platform>> getAllPlatformList();
}
