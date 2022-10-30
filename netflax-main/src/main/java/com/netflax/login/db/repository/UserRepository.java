package com.netflax.login.db.repository;

import com.netflax.login.db.model.EUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<EUser, Long> {

    Optional<EUser> findUserByUsernameAndRole(String username, String role);
    Optional<EUser> findUserByEmailAndRole(String email, String role);
}
