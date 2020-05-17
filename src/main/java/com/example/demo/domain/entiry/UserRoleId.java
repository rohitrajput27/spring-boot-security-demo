package com.example.demo.domain.entiry;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode()
public class UserRoleId implements Serializable {
    private User user;

    private Role role;
}
