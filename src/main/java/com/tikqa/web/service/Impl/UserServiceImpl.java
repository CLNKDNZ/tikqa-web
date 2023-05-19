package com.tikqa.web.service.Impl;


import com.tikqa.web.model.entity.TikqaRole;
import com.tikqa.web.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    private Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {
        users.put("yusuf", new User("yusuf", "yusuf123", new ArrayList<>()));
        users.put("metin", new User("metin", "metin123", new ArrayList<>()));
        users.put("dilek", new User("dilek", "dilek123", new ArrayList<>()));
        users.put("ahmet", new User("ahmet", "ahmet123", new ArrayList<>()));
        users.put("mehmet", new User("mehmet", "mehmet123", new ArrayList<>()));

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return users.get(username);
        // User tikqaUser = getUserByUsername(username);
        // TikqaUser tikqaUser = userRepository.getUserByUsername(username);
        // return buildUserFromUserEntity(tikqaUser);
    }

    private UserDetails buildUserFromUserEntity(User tikqaUser) {
        if (tikqaUser == null)
            throw new RuntimeException("User name not found in repository");

        String username = tikqaUser.getUsername();
        String password = tikqaUser.getPassword();
        Set<TikqaRole> tikqaRoles = null;
        // ADMIN yerine yukarıdaki tikqaRoles içerisinden değerleri al.
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ADMIN");
        List<GrantedAuthority> listAuthorities = new ArrayList<>();
        listAuthorities.add(grantedAuthority);

        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        UserDetails springUserDetails = new User(username,
                password,
                enabled,
                accountNonExpired,
                credentialsNonExpired,
                accountNonLocked,
                listAuthorities);
        return springUserDetails;
    }
}
