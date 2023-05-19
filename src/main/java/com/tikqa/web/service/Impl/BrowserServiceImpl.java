package com.tikqa.web.service.Impl;

import com.automasi.nocodeautomation.BrowserFactory;
import com.automasi.nocodeautomation.service.BrowserService;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class BrowserServiceImpl implements BrowserService {

    private final BrowserFactory browserFactory;

    @Override
    public WebDriver create(String browserName) {
        return browserFactory.createBrowser(browserName).create();
    }
}
