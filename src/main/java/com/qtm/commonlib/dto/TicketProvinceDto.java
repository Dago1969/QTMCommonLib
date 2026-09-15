package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO di lettura allineato alla risposta province di QTMTicket.
 */
@Getter
@Setter
@NoArgsConstructor
public class TicketProvinceDto {

    private Long id;
    private String name;
    private Long regionId;
}
