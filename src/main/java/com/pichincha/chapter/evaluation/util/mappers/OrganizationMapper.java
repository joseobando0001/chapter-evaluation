package com.pichincha.chapter.evaluation.util.mappers;

import com.pichincha.chapter.evaluation.domain.dto.OrganizationDto;
import com.pichincha.chapter.evaluation.domain.entities.OrganizationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganizationMapper {

    OrganizationDto entityToDto(OrganizationEntity entity);

    OrganizationEntity dtoToEntity(OrganizationDto dto);
}
