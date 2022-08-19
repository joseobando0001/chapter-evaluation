package com.pichincha.chapter.evaluation.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "repository")
@Getter
@Setter
public class RepositoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_repository", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "state", nullable = false, length = 1)
    private String state;
    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;
    @Column(name = "status", nullable = false, length = 1)
    private String status;
    @ManyToOne
    @JoinColumn(name = "id_tribe", referencedColumnName = "id_tribe", nullable = false, updatable = false)
    private TribeEntity tribeEntity;
    @OneToOne(mappedBy = "repository")
    private MetricsEntity metricsEntity;
}
