package pl.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hospital.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
