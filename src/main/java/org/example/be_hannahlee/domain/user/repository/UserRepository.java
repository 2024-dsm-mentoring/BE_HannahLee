package org.example.be_hannahlee.domain.user.repository;

import org.example.be_hannahlee.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByAccountId(String accountId);
}
