package com.tikqa.web.service.Impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@AllArgsConstructor
@Service
public class OperatorServiceImpl implements OperatorService {

    private final OperatingSystemRepository operatingSystemRepository;

    private final OperatingSystemVersionRepository operatingSystemVersionRepository;

    private final PlatformRepository platformRepository;

    private final BrowserRepository browserRepository;

    private final BrowserVersionRepository browserVersionRepository;

    @Override
    public RestResponse<List<OperatingSystem>> getAllOperatingSystemByPlatformId(Long platformId) {
        List<OperatingSystem> operatingSystemList = operatingSystemRepository.findAll();
        List<OperatingSystem> operatingSystemListByPlatform = new ArrayList<>();
        for (OperatingSystem operatingSystem : operatingSystemList) {
            for (Platform platform : operatingSystem.getPlatforms()) {
                if (platformId.equals(platform.getId())) {
                    operatingSystemListByPlatform.add(operatingSystem);
                }
            }
        }
        return success(operatingSystemListByPlatform);
    }

    @Override
    public RestResponse<List<OperatingSystemVersion>> getAllOperatingSystemVersionByOperatingSystemId(
            Long operatingSystemId) {
        List<OperatingSystemVersion> operatingSystemVersionList = operatingSystemVersionRepository.findAll();
        List<OperatingSystemVersion> operatingSystemVersionListByOperatingSystem = new ArrayList<>();
        for (OperatingSystemVersion operatingSystemVersion : operatingSystemVersionList) {
            if (operatingSystemVersion.getOperatingSystem() != null &&
                    operatingSystemId.equals(operatingSystemVersion.getOperatingSystem().getId())) {
                operatingSystemVersionListByOperatingSystem.add(operatingSystemVersion);
            }
        }
        return success(operatingSystemVersionListByOperatingSystem);
    }

    @Override
    public RestResponse<List<Browser>> getAllBrowserByOperatingSystemId(Long operatingSystemId) {
        List<Browser> browserList = browserRepository.findAll();
        List<Browser> browserListByOperatingSystem = new ArrayList<>();
        for (Browser browser : browserList) {
            for (OperatingSystem operatingSystem : browser.getOperatingSystems()) {
                if (operatingSystemId.equals(operatingSystem.getId())) {
                    browserListByOperatingSystem.add(browser);
                }
            }
        }
        return success(browserListByOperatingSystem);
    }

    @Override
    public RestResponse<List<BrowserVersion>> getAllBrowserVersionByBrowserId(Long browserId) {
        List<BrowserVersion> browserVersionList = browserVersionRepository.findAll();
        List<BrowserVersion> browserVersionListByBrowserId = new ArrayList<>();
        for (BrowserVersion browserVersion : browserVersionList) {
            if (browserVersion.getBrowser() != null &&
                    browserId.equals(browserVersion.getBrowser().getId())) {
                browserVersionListByBrowserId.add(browserVersion);
            }
        }
        return success(browserVersionListByBrowserId);
    }

    @Override
    public RestResponse<List<Platform>> getAllPlatformList() {
        var result = platformRepository.findAll();
        return success(result);
    }
}