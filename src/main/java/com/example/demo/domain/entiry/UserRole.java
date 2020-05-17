package com.example.demo.domain.entiry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_role")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(UserRoleId.class)
public class UserRole implements Serializable  {

    @Id
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;


    @Id
    @ManyToOne()
    @JoinColumn(name = "role")
    private Role role;
}
