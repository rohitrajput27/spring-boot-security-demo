package com.example.demo.controller;

import com.example.demo.domain.entiry.Role;
import com.example.demo.domain.model.User;
import com.example.demo.reposiroty.RoleRepository;
import com.example.demo.reposiroty.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/admin/auth")
@Slf4j
public class AdminController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
//    @Autowired
//    private UserRoleRepository userRoleRepository;

    @PostMapping(path = "/")
    public User createUser(@RequestBody User user) {
        com.example.demo.domain.entiry.User userDetail  = new com.example.demo.domain.entiry.User();
        userDetail.setEmail(user.getEmail());
        userDetail.setPassword(user.getPassword());
        userDetail.setIsValid("Y");
        userDetail.setUserName(user.getUserName());

//        Set<UserRole> userRoles = user.getRoles().stream().map(r -> new UserRole(userDetail,new Role(null,r.getRole()))).collect(Collectors.toSet());
        Set<Role> roles = user.getRoles().stream().map(r -> new Role(r.getRole())).collect(Collectors.toSet());

        List<Role> rolesFromDB = roleRepository.findAllById(user.getRoles().stream().map(r-> r.getRole()).collect(Collectors.toSet()));
        rolesFromDB.addAll(roles);

        userDetail.setRoles(new HashSet<>(rolesFromDB));
        userRepository.save(userDetail);
//        userRoleRepository.saveAll(userRoles);
        user.setUserId(userDetail.getUserId());
        return user;

    }

    @GetMapping(path = "/{userId}")
    public User getUser(@PathVariable Integer userId) {
        log.info("test with userid "+ userId);
        com.example.demo.domain.entiry.User userDetail = userRepository.getOne(userId);
        User user = new User(userDetail.getUserId(), userDetail.getUserName(), userDetail.getPassword(), userDetail.getEmail(), userDetail.getRoles().stream().map(userRole -> new com.example.demo.domain.model.Role(userRole.getRole())).collect(Collectors.toSet()));
        return user;

    }


}
