package me.shackox.repository;

import me.shackox.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SHACKOX on 31/10/17.
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail (String email);
}
