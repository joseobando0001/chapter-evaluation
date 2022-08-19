package com.pichincha.chapter.evaluation.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "organization")
@Getter
@Setter
public class OrganizationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_organization", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "status", nullable = false)
    private Integer status;
    @OneToMany(mappedBy = "organizationEntity", cascade = CascadeType.ALL)
    private List<TribeEntity> tribeEntities;
}
