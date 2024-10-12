package com.backend.booking.system.repository;

import com.backend.booking.system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {

    Optional<List<User>> findUserByEmailContainingIgnoreCase(String keyWord);

    @Query(value = "select name from User where email = :email", nativeQuery = true)
    Long searchIdByEmail(@Param("email") String email);

    @Query(value = "DELETE FROM User WHERE email= :email" ,nativeQuery = true)
    void deleteByEmail(String email);

    @Query(value = "SELECT u FROM User u WHERE u.email = ?1")
    User processLogin(String email);
}
