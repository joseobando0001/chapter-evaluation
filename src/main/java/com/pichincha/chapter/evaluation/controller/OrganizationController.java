package com.pichincha.chapter.evaluation.controller;

import com.pichincha.chapter.evaluation.domain.dto.OrganizationDto;
import com.pichincha.chapter.evaluation.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/organizations")
@Slf4j
@RequiredArgsConstructor
public class OrganizationController {
    private final OrganizationService organizationService;

    @GetMapping
    public ResponseEntity<List<OrganizationDto>> getAll() {
        log.info("Get organizations");
        return ResponseEntity.ok(organizationService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrganizationDto> getById(@PathVariable Long id) {
        log.info("Get by id" + id);
        return ResponseEntity.ok(organizationService.getById(id));
    }

    @PostMapping
    public ResponseEntity<OrganizationDto> create(@RequestBody @Valid OrganizationDto organizationDto) {
        log.info("Organization created");
        return new ResponseEntity<>(organizationService.create(organizationDto), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<OrganizationDto> update(@PathVariable Long id, @RequestBody @Valid OrganizationDto organizationDto) {
        log.info("Organization updated");
        return ResponseEntity.ok(organizationService.update(id, organizationDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        organizationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
