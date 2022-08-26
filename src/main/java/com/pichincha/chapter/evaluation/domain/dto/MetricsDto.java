package com.pichincha.chapter.evaluation.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class MetricsDto {
    private Long id;
    @NotNull
    private Double coverage;
    @NotNull
    private Integer bugs;
    @NotNull
    private Integer vulnerabilities;
    @NotNull
    private Integer hotspot;
    @NotNull
    private Integer codeSmells;
}
