package com.tikqa.web.model.user;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class UserRequest {
    private String username;
    private String password;
    private Set<RoleRequest> roles = new HashSet<>();
}
