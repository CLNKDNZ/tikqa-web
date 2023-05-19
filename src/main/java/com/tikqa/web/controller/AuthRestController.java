package com.tikqa.web.controller;

import com.automasi.nocodeautomation.model.dto.request.AuthRequest;
import com.automasi.nocodeautomation.model.dto.response.RestResponse;
import com.automasi.nocodeautomation.service.Impl.JwtUtil;
import com.automasi.nocodeautomation.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static com.automasi.nocodeautomation.enums.ErrorCode.ALREADY_EXIST_TOKEN;
import static com.automasi.nocodeautomation.model.dto.response.RestResponse.fail;
import static com.automasi.nocodeautomation.model.dto.response.RestResponse.success;

@RestController
@CrossOrigin("*")
public class AuthRestController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserServiceImpl userDetailsService;

    @CrossOrigin("*")
    @PostMapping("/login")
    public RestResponse<String> creteToken(@RequestBody AuthRequest authRequest) {
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

            if (authentication.isAuthenticated()) {
                String con = "Go";
            } else {
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(),
                        authRequest.getPassword(),
                        new ArrayList<>()));
            }
        } catch (BadCredentialsException ex) {
            return fail(ALREADY_EXIST_TOKEN, "Already exist token for " + authRequest.getUsername());
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);

        return success(jwt);
    }
}