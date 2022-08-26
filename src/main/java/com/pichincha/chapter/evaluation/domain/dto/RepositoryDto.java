package com.pichincha.chapter.evaluation.domain.dto;

import com.pichincha.chapter.evaluation.domain.entities.TribeEntity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RepositoryDto {
    private Long id;
    private String name;
    private String state;
    private LocalDateTime createTime;
    private String status;
    private TribeEntity tribeEntity;
    private MetricsDto metrics;
}
