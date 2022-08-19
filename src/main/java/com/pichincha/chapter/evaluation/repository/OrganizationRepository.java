package com.pichincha.chapter.evaluation.repository;

import com.pichincha.chapter.evaluation.domain.entities.OrganizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<OrganizationEntity, Long> {
}
