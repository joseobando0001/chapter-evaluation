package com.pichincha.chapter.evaluation.repository;

import com.pichincha.chapter.evaluation.domain.entities.TribeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TribeRepository extends JpaRepository<TribeEntity, Long> {
}
