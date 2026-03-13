package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO progetto condiviso tra QTMDashboard e TENANTS-APP.
 */
@Getter
@Setter
@NoArgsConstructor
public class ProjectDto {

    private Long id;
    private String code;
    private Long tenantId;
    private String tenant;

    /**
     * Descrizione del progetto.
     */
    private String descrizione;

    /**
     * Data di inizio progetto.
     */
    private java.time.LocalDate dataInizio;

    /**
     * Data di fine progetto.
     */
    private java.time.LocalDate dataFine;
}