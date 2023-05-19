package com.tikqa.web.repository;

import com.automasi.nocodeautomation.model.entity.TestCaseEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<TestCaseEvent, Long> {

    Optional<TestCaseEvent> deleteByIdAndName(Long id, String name);
}
