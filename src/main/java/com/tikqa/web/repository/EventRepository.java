package com.tikqa.web.repository;


import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<TestCaseEvent, Long> {

    Optional<TestCaseEvent> deleteByIdAndName(Long id, String name);
}
