package com.tikqa.web.service;


public interface UserService {

    void initialize();

    TikqaUser getUserByUsername(String username);
}
