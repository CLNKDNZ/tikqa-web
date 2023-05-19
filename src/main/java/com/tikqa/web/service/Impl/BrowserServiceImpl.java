package com.tikqa.web.service.Impl;


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
