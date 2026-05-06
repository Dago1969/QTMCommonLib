package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO farmaco condiviso tra i moduli QTM per esporre i dati AIC persistiti in QTMDB.
 */
@Getter
@Setter
@NoArgsConstructor
public class MedicineDto {

    private Long id;
    private String codiceAic;
    private String codFarmaco;
    private String codConfezione;
    private String denominazione;
    private String descrizione;
    private String codiceDitta;
    private String ragioneSociale;
    private String statoAmministrativo;
    private String tipoProcedura;
    private String forma;
    private String codiceAtc;
    private String paAssociati;
    private String fornitura;
    private String linkFi;
    private String linkRcp;
}