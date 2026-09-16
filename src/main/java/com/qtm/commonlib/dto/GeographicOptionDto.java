package com.qtm.commonlib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO minimale per popolare le select geografiche.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GeographicOptionDto {

    private Long id;
    private String name;
}
