package com.pichincha.chapter.evaluation.repository;

import com.pichincha.chapter.evaluation.domain.entities.MetricsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetricsRepository extends JpaRepository<MetricsEntity, Long> {
}
