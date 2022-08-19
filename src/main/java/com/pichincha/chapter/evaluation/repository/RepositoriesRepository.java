package com.pichincha.chapter.evaluation.repository;

import com.pichincha.chapter.evaluation.domain.entities.RepositoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoriesRepository extends JpaRepository<RepositoryEntity, Long> {
}
