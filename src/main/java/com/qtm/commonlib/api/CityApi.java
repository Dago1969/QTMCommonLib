package com.qtm.commonlib.api;

import com.qtm.commonlib.dto.CityDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/** Contratto condiviso per le operazioni REST sulle città. */
public interface CityApi {

    @GetMapping("/cities")
    List<CityDto> findCities();

    @GetMapping("/cities/by-province/{provinceId}")
    List<CityDto> findCitiesByProvinceId(@PathVariable("provinceId") Long provinceId);

    @GetMapping("/cities/{id}")
    ResponseEntity<CityDto> findCityById(@PathVariable("id") Long id);

    @PostMapping("/cities")
    CityDto createCity(@RequestBody CityDto dto);

    @PutMapping("/cities/{id}")
    CityDto updateCity(@PathVariable("id") Long id, @RequestBody CityDto dto);

    @DeleteMapping("/cities/{id}")
    ResponseEntity<Void> deleteCity(@PathVariable("id") Long id);
}