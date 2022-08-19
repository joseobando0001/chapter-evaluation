package com.pichincha.chapter.evaluation.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tribe")
@Getter
@Setter
public class TribeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tribe", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "status", nullable = false)
    private Integer status;
    @ManyToOne
    @JoinColumn(name = "id_organization", referencedColumnName = "id_organization", nullable = false, updatable = false)
    private OrganizationEntity organizationEntity;
    @OneToMany(mappedBy = "tribeEntity", cascade = CascadeType.ALL)
    private List<RepositoryEntity> repositoryList;
}
