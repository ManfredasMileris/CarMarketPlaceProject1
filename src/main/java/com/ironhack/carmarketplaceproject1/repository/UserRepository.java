package com.ironhack.carmarketplaceproject1.repository;


import com.ironhack.carmarketplaceproject1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
