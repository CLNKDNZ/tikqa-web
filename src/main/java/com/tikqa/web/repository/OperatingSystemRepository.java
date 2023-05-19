package com.tikqa.web.repository;

import com.automasi.nocodeautomation.model.entity.OperatingSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatingSystemRepository extends JpaRepository<OperatingSystem, Long> {

}
