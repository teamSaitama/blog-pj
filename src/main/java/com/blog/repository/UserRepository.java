package com.blog.repository;

import com.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     *
     * @param username
     * @param password
     * @return User
     *
     * SELECT *
     * FROM USER
     * WHERE USER_NAME = ? ANd PASSWORD = ?
     */
    public User findByUsernameAndPassword(String username, String password);
}
