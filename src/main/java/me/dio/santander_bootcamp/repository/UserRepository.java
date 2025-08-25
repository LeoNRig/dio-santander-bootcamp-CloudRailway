package me.dio.santander_bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.santander_bootcamp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
