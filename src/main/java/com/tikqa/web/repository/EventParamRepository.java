package com.tikqa.web.repository;


import com.tikqa.web.model.entity.EventParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventParamRepository extends JpaRepository<EventParam, Long> {

}
