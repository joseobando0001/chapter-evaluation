package com.pichincha.chapter.evaluation.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "repository")
@Getter
@Setter
public class Repository {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
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
    @JoinColumn(name = "id_tribe", referencedColumnName = "id", nullable = false, updatable = false)
    private Tribe tribe;
    @OneToOne(mappedBy = "repository")
    private Metrics metrics;
}
