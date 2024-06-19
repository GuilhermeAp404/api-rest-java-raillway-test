package me.dio.lab.api_rest_railway.domain.repository;

import me.dio.lab.api_rest_railway.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
