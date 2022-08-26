package com.pichincha.chapter.evaluation.service.webclient.impl;

import com.pichincha.chapter.evaluation.domain.dto.RepoDto;
import com.pichincha.chapter.evaluation.domain.dto.StatusDto;
import com.pichincha.chapter.evaluation.service.webclient.RepositoryStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Objects;

@Service
public class RepositoryStatusImpl implements RepositoryStatus {
    private final WebClient webClient;

    public RepositoryStatusImpl() {
        this.webClient = WebClient.builder().baseUrl("https://253b6042-ec17-4ee8-8d7d-ea9d62805337.mock.pstmn.io").build();
    }

    @Override
    public List<StatusDto> findAllStatus() {
        Mono<RepoDto> mono = this.webClient.get().uri("/v1/repositories/verified")
                .retrieve().bodyToMono(RepoDto.class);
        return Objects.requireNonNull(mono.block()).getRepositories();
    }
}
