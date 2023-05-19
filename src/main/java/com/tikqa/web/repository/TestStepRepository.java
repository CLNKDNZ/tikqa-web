package com.tikqa.web.repository;

import com.automasi.nocodeautomation.model.entity.TestStep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestStepRepository extends JpaRepository<TestStep, Long> {
}
