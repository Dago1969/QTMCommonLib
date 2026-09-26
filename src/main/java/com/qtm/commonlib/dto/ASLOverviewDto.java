package com.qtm.commonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ASLOverviewDto {
    private Long id;
    private Long aslId;                   // <-- Aggiunto
    private Integer anno;
    private String codiceAzienda;
    private String codiceAsl;              // <-- Aggiunto
    private String denominazioneAzienda;
    private String asl;                    // <-- Aggiunto
    private String codiceRegione;
    private Long provinciaId;
    private String provinciaDescrizione;
    private String regioneDescrizione;
    private String indirizzo;
    private String email;
    private String telefono;
    private Boolean imported;
    private String note;
}