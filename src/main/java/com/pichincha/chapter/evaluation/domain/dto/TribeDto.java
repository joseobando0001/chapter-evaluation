package com.pichincha.chapter.evaluation.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class TribeDto {
    private Long id;
    private String name;
    private Integer status;
    private OrganizationDto organization;
    private List<RepositoryDto> repositories;
}
