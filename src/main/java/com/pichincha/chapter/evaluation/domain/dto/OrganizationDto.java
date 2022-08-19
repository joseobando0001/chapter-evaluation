package com.pichincha.chapter.evaluation.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class OrganizationDto implements Serializable {
    private Long id;
    @NotBlank
    private String name;
    @NotNull
    private Integer status;

}
