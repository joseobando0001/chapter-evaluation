package com.pichincha.chapter.evaluation.service;

import com.pichincha.chapter.evaluation.domain.dto.ReportRepositoryDto;

import java.util.List;

public interface ReportService {

    List<ReportRepositoryDto> getReportWithState(Long tribeId);
}
