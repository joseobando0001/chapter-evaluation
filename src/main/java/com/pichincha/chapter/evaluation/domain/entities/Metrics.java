package com.pichincha.chapter.evaluation.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "metrics")
@Getter
@Setter
public class Metrics {
    @Id
    @Column(name = "id_repository", nullable = false)
    private Long id;
    @Column(name = "coverage", nullable = false)
    private Double coverage;
    @Column(name = "bugs", nullable = false)
    private Integer bugs;
    @Column(name = "vulnerabilities", nullable = false)
    private Integer vulnerabilities;
    @Column(name = "hotspot", nullable = false)
    private Integer hotspot;
    @Column(name = "code_smells", nullable = false)
    private Integer codeSmells;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "id_repository", referencedColumnName = "id")
    private Repository repository;

}
