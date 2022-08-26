package com.pichincha.chapter.evaluation.controller;

import com.pichincha.chapter.evaluation.domain.dto.ReportRepositoryDto;
import com.pichincha.chapter.evaluation.service.ReportService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reports")
@Slf4j
@RequiredArgsConstructor
public class ReportController {
    private final ReportService reportService;

    @GetMapping("/{tribeId}")
    ResponseEntity<List<ReportRepositoryDto>> getReport(@PathVariable Long tribeId) {
        return ResponseEntity.ok(reportService.getReportWithState(tribeId));
    }


}
