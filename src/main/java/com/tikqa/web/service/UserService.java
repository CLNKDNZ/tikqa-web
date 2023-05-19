package com.tikqa.web.service;


import com.tikqa.web.model.entity.TikqaUser;

public interface UserService {

    void initialize();

    TikqaUser getUserByUsername(String username);
}
