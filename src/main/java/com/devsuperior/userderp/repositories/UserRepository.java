package com.devsuperior.userderp.repositories;

import com.devsuperior.userderp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
