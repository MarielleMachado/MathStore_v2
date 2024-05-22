package com.BackEnd.MathStoreOnline2.repository;

import com.BackEnd.MathStoreOnline2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByEmail(String email);
}
