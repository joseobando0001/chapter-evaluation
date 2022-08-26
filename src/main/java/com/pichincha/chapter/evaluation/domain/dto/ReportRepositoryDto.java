package com.pichincha.chapter.evaluation.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReportRepositoryDto {
    private Long id;
    private String name;
    private String state;
    private String tribe;
    private String organization;
    private Double coverage;
    private Integer codeSmells;
    private Integer bugs;
    private Integer vulnerabilities;
    private Integer hotspots;
    private String verificationState;

    public ReportRepositoryDto(Long id, String name, String state, String tribe, String organization, Double coverage, Integer codeSmells, Integer bugs, Integer vulnerabilities, Integer hotspots) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.tribe = tribe;
        this.organization = organization;
        this.coverage = coverage;
        this.codeSmells = codeSmells;
        this.bugs = bugs;
        this.vulnerabilities = vulnerabilities;
        this.hotspots = hotspots;
    }
}
