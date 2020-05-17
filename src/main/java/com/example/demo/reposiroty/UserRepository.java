package com.example.demo.reposiroty;

import com.example.demo.domain.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(@Param("userName") String userName);

}
