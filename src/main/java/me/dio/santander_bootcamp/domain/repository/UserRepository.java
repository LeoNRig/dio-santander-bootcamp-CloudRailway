package me.dio.santander_bootcamp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.santander_bootcamp.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    boolean existsByAccountNumer(String accountNumber);

}
