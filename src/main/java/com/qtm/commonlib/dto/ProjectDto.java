package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private String clientCode;

    /**
     * Descrizione del progetto.
     */
    private String descrizione;

    /**
     * Riferimento logo configurato per il progetto.
     */
    private String logo;

    /**
     * Footer personalizzato del progetto.
     */
    private String footer;

    /**
     * Mittente email configurato per il progetto.
     */
    private String emailSender;

    /**
     * Data di inizio progetto.
     */
    private LocalDate dataInizio;

    /**
     * Data di fine progetto.
     */
    private LocalDate dataFine;

    /**
     * Elenco amministratori selezionati nel wizard progetto.
     */
    private List<ProjectAdministratorDto> administrators = new ArrayList<>();

    /**
     * Elenco ruoli collegati al progetto.
     */
    private List<String> roleIds = new ArrayList<>();

    /**
     * Elenco componenti/moduli abilitati per il progetto.
     */
    private List<String> enabledModuleCodes = new ArrayList<>();

    /**
     * Template JSON delle visite associato al progetto.
     */
    private String jsonVisit;
}