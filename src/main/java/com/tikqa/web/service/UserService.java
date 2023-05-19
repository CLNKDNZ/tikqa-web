package com.tikqa.web.service;

import com.automasi.nocodeautomation.model.entity.TikqaUser;

public interface UserService {

    void initialize();

    TikqaUser getUserByUsername(String username);
}
