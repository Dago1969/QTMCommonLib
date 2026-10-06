package com.qtm.commonlib.api;

import com.qtm.commonlib.dto.ProvinceDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/** Contratto condiviso per le operazioni REST sulle province. */
public interface ProvinceApi {

    @GetMapping("/provinces")
    List<ProvinceDto> findProvinces();

    @GetMapping("/provinces/by-region/{regionId}")
    List<ProvinceDto> findProvincesByRegionId(@PathVariable("regionId") Long regionId);

    @GetMapping("/provinces/{id}")
    ResponseEntity<ProvinceDto> findProvinceById(@PathVariable("id") Long id);

    @PostMapping("/provinces")
    ProvinceDto createProvince(@RequestBody ProvinceDto dto);

    @PutMapping("/provinces/{id}")
    ProvinceDto updateProvince(@PathVariable("id") Long id, @RequestBody ProvinceDto dto);

    @DeleteMapping("/provinces/{id}")
    ResponseEntity<Void> deleteProvince(@PathVariable("id") Long id);
}