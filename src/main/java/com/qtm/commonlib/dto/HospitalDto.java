package com.qtm.commonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class HospitalDto {
    private Long id;
    private Integer anno;
    private String codiceRegione;
    private String regione;
    private String codiceAsl;
    private String asl;
    private String codiceStruttura;
    private String struttura;
    private String indirizzo;
    private Long hospitalTypeId;
    private String tipoStruttura;
    private Long aslId;
    // Nome comune come fornito da QTMTicket
    private String comune;
    private Long cityId;
    // Sigla o descrizione provincia fornita da QTMTicket (es. "MI", "Milano")
    private String siglaProvincia;
}
