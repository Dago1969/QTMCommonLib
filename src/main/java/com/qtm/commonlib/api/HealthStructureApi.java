package com.qtm.commonlib.api;

import com.qtm.commonlib.dto.ASLDto;
import com.qtm.commonlib.dto.DisciplinaDto;
import com.qtm.commonlib.dto.HospitalDto;
import com.qtm.commonlib.dto.StructureDepartmentSourceDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/** Contratto REST condiviso per il catalogo delle strutture sanitarie. */
public interface HealthStructureApi {
    String ASL_PATH = "/asl";
    String ASL_BY_ID_PATH = ASL_PATH + "/{id}";

    @GetMapping(ASL_PATH)
    List<ASLDto> findAsl();

    @GetMapping(ASL_BY_ID_PATH)
    ResponseEntity<ASLDto> findAsl(@PathVariable("id") Long id);

    @PostMapping(ASL_PATH)
    ASLDto createAsl(@RequestBody ASLDto dto);

    @PutMapping(ASL_BY_ID_PATH)
    ASLDto updateAsl(@PathVariable("id") Long id, @RequestBody ASLDto dto);

    @DeleteMapping(ASL_BY_ID_PATH)
    ResponseEntity<Void> deleteAsl(@PathVariable("id") Long id);

    @GetMapping("/ospedali")
    List<HospitalDto> findHospitals();

    @GetMapping("/ospedali/{id}")
    ResponseEntity<HospitalDto> findHospital(@PathVariable("id") Long id);

    @PostMapping("/ospedali")
    HospitalDto createHospital(@RequestBody HospitalDto dto);

    @PutMapping("/ospedali/{id}")
    HospitalDto updateHospital(@PathVariable("id") Long id, @RequestBody HospitalDto dto);

    @DeleteMapping("/ospedali/{id}")
    ResponseEntity<Void> deleteHospital(@PathVariable("id") Long id);

    @GetMapping("/discipline")
    List<DisciplinaDto> findDisciplines();

    @GetMapping("/discipline/{id}")
    ResponseEntity<DisciplinaDto> findDiscipline(@PathVariable("id") String id);

    @PostMapping("/discipline")
    DisciplinaDto createDiscipline(@RequestBody DisciplinaDto dto);

    @DeleteMapping("/discipline/{id}")
    ResponseEntity<Void> deleteDiscipline(@PathVariable("id") String id);

    @GetMapping("/dipartimenti")
    List<StructureDepartmentSourceDto> findDepartments(
            @RequestParam(name = "codiceStruttura", required = false) String codiceStruttura);

    @PostMapping("/dipartimenti")
    StructureDepartmentSourceDto createDepartment(@RequestBody StructureDepartmentSourceDto dto);

    @DeleteMapping("/dipartimenti/{id}")
    ResponseEntity<Void> deleteDepartment(@PathVariable("id") Long id);
}