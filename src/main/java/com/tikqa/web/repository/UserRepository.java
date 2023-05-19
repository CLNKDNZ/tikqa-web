package com.tikqa.web.repository;

import com.automasi.nocodeautomation.model.entity.TikqaUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<TikqaUser, Long> {

    @Query("SELECT u FROM TikqaUser u WHERE u.username = :username")
    public TikqaUser getUserByUsername(@Param("username") String username);
}
