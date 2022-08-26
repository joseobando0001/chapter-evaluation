package com.pichincha.chapter.evaluation.service.webclient;

import com.pichincha.chapter.evaluation.domain.dto.StatusDto;

import java.util.List;

public interface RepositoryStatus {

    List<StatusDto> findAllStatus();
}
