package com.tikqa.web.repository;

import com.automasi.nocodeautomation.model.entity.Browser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrowserRepository extends JpaRepository<Browser, Long> {
}
