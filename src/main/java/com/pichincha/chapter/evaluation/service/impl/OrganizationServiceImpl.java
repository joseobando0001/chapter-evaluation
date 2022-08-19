package com.pichincha.chapter.evaluation.service.impl;

import com.pichincha.chapter.evaluation.domain.dto.OrganizationDto;
import com.pichincha.chapter.evaluation.domain.entities.OrganizationEntity;
import com.pichincha.chapter.evaluation.repository.OrganizationRepository;
import com.pichincha.chapter.evaluation.service.OrganizationService;
import com.pichincha.chapter.evaluation.util.mappers.OrganizationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private final OrganizationRepository organizationRepository;
    private final OrganizationMapper mapper;

    @Override
    public OrganizationDto getById(Long id) {
        return mapper.entityToDto(validateAndGetById(id));
    }

    @Override
    public List<OrganizationDto> getAll() {
        return organizationRepository.findAll().stream().map(mapper::entityToDto).toList();
    }

    @Override
    public OrganizationDto create(OrganizationDto organizationDto) {
        return mapper.entityToDto(this.organizationRepository.save(
                mapper.dtoToEntity(organizationDto)));
    }

    @Override
    public OrganizationDto update(Long id, OrganizationDto organizationDto) {
        validateAndGetById(id);
        return mapper.entityToDto(this.organizationRepository.save(
                mapper.dtoToEntity(organizationDto)));
    }

    @Override
    public void deleteById(Long id) {
        validateAndGetById(id);
        organizationRepository.deleteById(id);
    }

    private OrganizationEntity validateAndGetById(Long id) {
        return organizationRepository.findById(id).orElseThrow(IllegalStateException::new);
    }
}
