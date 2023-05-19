package com.tikqa.web.repository;

import com.automasi.nocodeautomation.model.entity.SelectorType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectorTypeRepository extends JpaRepository<SelectorType, Long> {

}
