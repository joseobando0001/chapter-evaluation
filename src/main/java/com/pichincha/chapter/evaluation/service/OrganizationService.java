package com.pichincha.chapter.evaluation.service;

import com.pichincha.chapter.evaluation.domain.dto.OrganizationDto;

import java.util.List;

public interface OrganizationService {

    OrganizationDto getById(Long id);

    List<OrganizationDto> getAll();

    OrganizationDto create(OrganizationDto data);

    OrganizationDto update(Long id, OrganizationDto data);

    void deleteById(Long id);

}
