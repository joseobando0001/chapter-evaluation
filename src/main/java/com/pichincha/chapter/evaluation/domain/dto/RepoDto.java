package com.pichincha.chapter.evaluation.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class RepoDto {
    private List<StatusDto> repositories;
}
