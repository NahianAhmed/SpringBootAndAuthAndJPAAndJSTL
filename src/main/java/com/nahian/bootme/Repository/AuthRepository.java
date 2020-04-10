package com.nahian.bootme.Repository;

import com.nahian.bootme.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AuthRepository extends JpaRepository<Users,Integer> {
    Optional<Users> findByUserName(String userName);
}
