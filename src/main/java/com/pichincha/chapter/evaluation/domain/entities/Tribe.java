package com.pichincha.chapter.evaluation.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tribe")
@Getter
@Setter
public class Tribe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "status", nullable = false)
    private Integer status;
    @ManyToOne
    @JoinColumn(name = "id_organization", referencedColumnName = "id", nullable = false, updatable = false)
    private Organization organization;
    @OneToMany(mappedBy = "tribe", cascade = CascadeType.ALL)
    private List<Repository> repositoryList;
}
