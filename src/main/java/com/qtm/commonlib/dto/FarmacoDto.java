package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO condiviso per la ricerca dei farmaci nel catalogo centrale AIFA.
 */
@Getter
@Setter
@NoArgsConstructor
public class FarmacoDto {

    private String aicCode;
    private String tradeName;
    private String activeIngredient;
    private String dosage;
}