package com.example.demo.security.service;

import com.example.demo.domain.entiry.User;
import com.example.demo.reposiroty.UserRepository;
import com.example.demo.security.CustomUserDetials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        CustomUserDetials customUserDetials = null;
        if (user != null) {
            customUserDetials = new CustomUserDetials();
            customUserDetials.setUser(user);
        } else {
            throw new UsernameNotFoundException("User not found with user name " + user.getUserName());
        }
        return customUserDetials;
    }
}
