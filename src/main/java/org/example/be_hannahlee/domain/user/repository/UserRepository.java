package org.example.be_hannahlee.domain.user.repository;

import org.example.be_hannahlee.domain.user.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Boolean existsByAccountId(String accountId);
}
