package com.qtm.commonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO per la trasmissione dei dati ASL.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ASLDto {
    private Long id;
    private String codiceAzienda;
    private String denominazioneAzienda;
    private Long cityId;
    private String indirizzo;
    private String cap;
    private String telefono;
    private String fax;
    private String email;
    private String sitoWeb;
    private String partitaIva;
    private String note;
    private java.util.List<ReferentDto> referents;
}
