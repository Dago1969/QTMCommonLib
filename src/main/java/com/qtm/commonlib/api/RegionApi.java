package com.qtm.commonlib.api;

import com.qtm.commonlib.dto.RegionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/** Contratto condiviso per le operazioni REST sulle regioni. */
public interface RegionApi {

    @GetMapping("/regions")
    List<RegionDto> findRegions();

    @GetMapping("/regions/{id}")
    ResponseEntity<RegionDto> findRegionById(@PathVariable("id") Long id);

    @PostMapping("/regions")
    RegionDto createRegion(@RequestBody RegionDto dto);

    @PutMapping("/regions/{id}")
    RegionDto updateRegion(@PathVariable("id") Long id, @RequestBody RegionDto dto);

    @DeleteMapping("/regions/{id}")
    ResponseEntity<Void> deleteRegion(@PathVariable("id") Long id);
}