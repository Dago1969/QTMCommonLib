package com.qtm.commonlib.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO di lettura allineato alla risposta regioni di QTMTicket.
 */
@Getter
@Setter
@NoArgsConstructor
public class TicketRegionDto {

    private Long id;
    private String name;
}
