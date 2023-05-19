package com.tikqa.web.repository;

import com.automasi.nocodeautomation.model.entity.BrowserVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrowserVersionRepository extends JpaRepository<BrowserVersion, Long> {

}
