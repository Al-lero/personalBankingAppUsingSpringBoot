package com.bankprototype.alerobank.data.repository;

import com.bankprototype.alerobank.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    Boolean existsUserByEmail(String email);
}
