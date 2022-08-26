package com.pichincha.chapter.evaluation.repository;

import com.pichincha.chapter.evaluation.domain.dto.ReportRepositoryDto;

import java.util.List;

public interface ReportRepository {
    List<ReportRepositoryDto> getReport(Long tribeId);
}
