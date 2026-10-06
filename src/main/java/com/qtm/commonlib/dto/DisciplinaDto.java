package com.qtm.commonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** DTO condiviso per le discipline sanitarie. */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DisciplinaDto {
    private String codiceDisciplina;
    private String disciplina;
}