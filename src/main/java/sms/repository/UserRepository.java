package sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sms.model.AppUser;

import java.util.Optional;

public interface UserRepository

     extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUsername(String username);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
