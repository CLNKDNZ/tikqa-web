package com.tikqa.web.repository;

import com.automasi.nocodeautomation.model.entity.OperatingSystemVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatingSystemVersionRepository extends JpaRepository<OperatingSystemVersion, Long> {

}
