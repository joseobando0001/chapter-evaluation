package com.pichincha.chapter.evaluation.service.impl;

import com.pichincha.chapter.evaluation.domain.dto.ReportRepositoryDto;
import com.pichincha.chapter.evaluation.domain.dto.StatusDto;
import com.pichincha.chapter.evaluation.repository.ReportRepository;
import com.pichincha.chapter.evaluation.service.ReportService;
import com.pichincha.chapter.evaluation.service.webclient.RepositoryStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {
    private final RepositoryStatus repositoryStatus;
    private final ReportRepository reportRepository;
    private final Map<Long, String> statusMap = Map.of(604L, "Verificado",
            605L, "En espera",
            606L, "Aprobado");

    @Override
    public List<ReportRepositoryDto> getReportWithState(Long tribeId) {
        List<ReportRepositoryDto> reportRepositoryDtoList = reportRepository.getReport(tribeId);
        List<StatusDto> statusDtoList = repositoryStatus.findAllStatus();
        reportRepositoryDtoList.stream().parallel().forEach(repositoryDto -> repositoryDto.setVerificationState(obtainState(statusDtoList, repositoryDto.getId())));
        return reportRepositoryDtoList;
    }

    private String obtainState(List<StatusDto> statusDtoList, Long repositoryId) {
        AtomicReference<String> verificationStatus = new AtomicReference<>("None");
        statusDtoList.stream().filter(s -> Objects.equals(s.getId(), repositoryId)).findFirst()
                .flatMap(detail ->
                        Optional.of(statusMap.get(detail.getState())))
                .ifPresent(verificationStatus::set);
        return verificationStatus.get();

    }
}
